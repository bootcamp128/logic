//jquery is js framework
	// ready for DOM HTML

$(document).ready(function(){
	//event untuk button delet
	$('.del').on('click', function(){
		//alert('will delete the record..!');
		var conf = confirm("are your sure delete data ?");
		var id = $(this).attr('data-id');
		if(conf){
			//ajax (Asyncronous JavaScript and XML)
			$.ajax({
				url : 'employee/delete/'+id,
				type: 'DELETE',
				success: function(data){
				    window.location="employee"
				}, error: function(){
					alert('fail delete data !!');
				}
			});
		}
		
		return false;
	});
	
	//event untuk update
	$('.upd').on('click', function(){
		var id = $(this).attr('data-id');
		$.ajax({
			url: 'penjualan/get/'+id,
			type: 'GET',
			success: function(penjualan){
				console.log(penjualan);
				_setFormModalUpdate(penjualan);
			},error: function(){
				alert('failed load data');
			}
		});
		$('#modal-data-edit').modal();
	});
	
	$('.select-btn').on('click',  function(){
		var dataTr = $(this).parent().parent();
		var penjualanId = $(this).attr('data-id');
		var customerId = $(this).attr('customer-id');
		
		var penjualan = {
			id : penjualanId,
			customer : {
				id : customerId
			},
			noPenjualan : dataTr.find('td').eq(0).text(),
			location : dataTr.find('td').eq(1).text(),
			pembeli : dataTr.find('td').eq(2).text(),
			emailPembeli : dataTr.find('td').eq(3).text()
		}
		__appendSelectionData(penjualan);
		
		dataTr.remove();
	});
	
	//Read Table Selection to server 
	$('#click-beli').on('click', function(){
		
		var oTable = $('#table-selection').find('tbody');
		var dataPenjualan = [];
		
		$.each(oTable.find('tr'), function(index, data){
			var cusId = $(this).attr('customer-id');
			var penId = $(this).attr('data-id');
	
			var penjualan = {
				id : penId,
				no_penjualan: $(this).find('td').eq(0).text(),
				location : $(this).find('td').eq(1).text(),
				customer : {
					id : cusId
				}	
			};
			
			dataPenjualan.push(penjualan);
		});
		
		//send to server with ajax
		$.ajax({
			url : 'penjualan/transaction',
			type: 'POST',
			beforeSend : function(){
				alert('si ajax mau sending data ');
			},
			data: JSON.stringify(dataPenjualan),
			contentType: 'application/json',
			success : function(data){
				console.log(data);
			},error : function(){
				alert('gagal');
			}
			
		});
	});
	
	$('#btn-change').on('click', function(){
		//var employee = _getFormModalUpdate();
		var penjualan = {
			id : $('#id-penjualan').val(),
			no_penjualan : $('#input-no-penjualan').val(),
			location : $('#input-lokasi').val(),
			customer : {
				id : $('#input-pembeli').val()
			}
		}
		$.ajax({
			url : 'penjualan/update',
			type: 'PUT',
			data: JSON.stringify(penjualan),
			contentType: "application/json",
			success: function(data){
				
				window.location="penjualan";
				//$('#modal-data-edit').modal('hide');
			},error : function(){
				console.log('data gagal diubah!!');
			}
		});
		
	});
	//set form update data
	function _setFormModalUpdate(penjualan){
		$('#input-no-penjualan').val(penjualan.no_penjualan);
		$('#input-lokasi').val(penjualan.location);
		$('#id-penjualan').val(penjualan.id);
		$('#input-pembeli').
			val(penjualan.customer.id).prop('selected', true);
	}
	//get form update data
	function _getFormModalUpdate(){
		return employee = {
			id : $('#employee-id').val(),
			name : $('#inputName').val(),
			address : $('#inputAddress').val(),
			email : $('#inputEmail').val(),
			birthDay: Date.parse($('#tgl-id').val())
		};
	}
	
	function __appendSelectionData(penjualan){
		var tSelection = $('#table-selection');
		var bodyTable = tSelection.find('tbody');
		var trData = "<tr data-id='"+penjualan.id+"' customer-id='"+penjualan.customer.id+"'>";
				trData+= "<td>";
					trData+= penjualan.noPenjualan;
				trData+= "</td>";
				trData+= "<td>";
					trData+= penjualan.location;
				trData+= "</td>";
				trData+= "<td>";
					trData+= penjualan.pembeli;
				trData+= "</td>";
				trData+= "<td>";
					trData+= penjualan.emailPembeli;
				trData+= "</td>";
				trData+= "<td>";
					trData+= "<a class='btn btn-danger hapus-item'>hapus</a>";
				trData+= "</td>";
			trData+= "</tr>";
		bodyTable.append(trData);
	}
});