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
});