<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<table class="table table-striped table-hover table-bordered"
	id="sample_editable_1">
	<thead>
		<tr>
			<th>NSX ID</th>
			<th>NSX Name</th>
			<th>Contact</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listnsx}" var="nsx">
			<tr class="odd gradeX">
				<td>${nsx.mansx}</td>
				<td>${nsx.tennsx}</td>
				<td>${nsx.sdt}</td>
				<td><a
					href="<c:url value='/admin/product/edit?id=${product.ID}'/>"
					class="center">Sửa</a> | <a
					href="<c:url value='/admin/product/delete?id=${product.ID}'/>"
					class="center">Xóa</a></td>
			</tr>
		</c:forEach>

	</tbody>
</table>
<script>
	$(document).ready(
			function() {
				var table = $('#example').DataTable({
					lengthChange : false,
					buttons : [ 'copy', 'excel', 'pdf', 'colvis' ]
				});

				table.buttons().container().appendTo(
						'#example_wrapper .col-md-6:eq(0)');
			});
</script>

