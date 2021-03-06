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
			url: 'employee/get/'+id,
			type: 'GET',
			success: function(employee){
				_setFormModalUpdate(employee);
			},error: function(){
				alert('failed load data');
			}
		});
		$('#modal-data-edit').modal();
	});
	
	$('#btn-change').on('click', function(){
		var employee = _getFormModalUpdate();
		$.ajax({
			url : 'employee/update',
			type: 'PUT',
			data: JSON.stringify(employee),
			contentType: "application/json",
			success: function(data){
				window.location="employee";
				//$('#modal-data-edit').modal('hide');
			},error : function(){
				console.log('data gagal diubah!!');
			}
		});
		
	});
	//set form update data
	function _setFormModalUpdate(employee){
		$('#inputName').val(employee.name);
		$('#inputAddress').val(employee.address);
		$('#inputEmail').val(employee.email);
		$('#employee-id').val(employee.id);
		$('#tgl-id').val(employee.birthDay);
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