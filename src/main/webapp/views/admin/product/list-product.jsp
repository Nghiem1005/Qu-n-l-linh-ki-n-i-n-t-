<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<div class="page-content-wrapper">
	<div class="page-content">
		<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
		<div class="modal fade" id="portlet-config" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true"></button>
						<h4 class="modal-title">Modal title</h4>
					</div>
					<div class="modal-body">Widget settings form goes here</div>
					<div class="modal-footer">
						<button type="button" class="btn blue">Save changes</button>
						<button type="button" class="btn default" data-dismiss="modal">Close</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
		<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
		<!-- BEGIN STYLE CUSTOMIZER -->
		<div class="theme-panel">
			<div class="toggler tooltips" data-container="body"
				data-placement="left" data-html="true"
				data-original-title="Click to open advance theme customizer panel">
				<i class="icon-settings"></i>
			</div>
			<div class="toggler-close">
				<i class="icon-close"></i>
			</div>
			<div class="theme-options">
				<div class="theme-option theme-colors clearfix">
					<span> THEME COLOR </span>
					<ul>
						<li class="color-default current tooltips" data-style="default"
							data-container="body" data-original-title="Default"></li>
						<li class="color-grey tooltips" data-style="grey"
							data-container="body" data-original-title="Grey"></li>
						<li class="color-blue tooltips" data-style="blue"
							data-container="body" data-original-title="Blue"></li>
						<li class="color-dark tooltips" data-style="dark"
							data-container="body" data-original-title="Dark"></li>
						<li class="color-light tooltips" data-style="light"
							data-container="body" data-original-title="Light"></li>
					</ul>
				</div>
				<div class="theme-option">
					<span> Theme Style </span> <select
						class="layout-style-option form-control input-small">
						<option value="square" selected="selected">Square corners</option>
						<option value="rounded">Rounded corners</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Layout </span> <select
						class="layout-option form-control input-small">
						<option value="fluid" selected="selected">Fluid</option>
						<option value="boxed">Boxed</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Header </span> <select
						class="page-header-option form-control input-small">
						<option value="fixed" selected="selected">Fixed</option>
						<option value="default">Default</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Top Dropdown</span> <select
						class="page-header-top-dropdown-style-option form-control input-small">
						<option value="light" selected="selected">Light</option>
						<option value="dark">Dark</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Mode</span> <select
						class="sidebar-option form-control input-small">
						<option value="fixed">Fixed</option>
						<option value="default" selected="selected">Default</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Style</span> <select
						class="sidebar-style-option form-control input-small">
						<option value="default" selected="selected">Default</option>
						<option value="compact">Compact</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Menu </span> <select
						class="sidebar-menu-option form-control input-small">
						<option value="accordion" selected="selected">Accordion</option>
						<option value="hover">Hover</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Position </span> <select
						class="sidebar-pos-option form-control input-small">
						<option value="left" selected="selected">Left</option>
						<option value="right">Right</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Footer </span> <select
						class="page-footer-option form-control input-small">
						<option value="fixed">Fixed</option>
						<option value="default" selected="selected">Default</option>
					</select>
				</div>
			</div>
		</div>
		<!-- END STYLE CUSTOMIZER -->
		<!-- BEGIN PAGE HEADER-->
		<div class="page-bar">
			<ul class="page-breadcrumb">
				<li><i class="fa fa-home"></i> <a href="index.html">Trang chủ</a> <i
					class="fa fa-angle-right"></i></li>
				<li><a href="#">Sản phẩm</a> <i class="fa fa-angle-right"></i>
				</li>
			</ul>
			<div class="page-toolbar">
				<div id="dashboard-report-range"
					class="tooltips btn btn-fit-height btn-sm green-haze btn-dashboard-daterange"
					data-container="body" data-placement="left"
					data-original-title="Change dashboard date range">
					<i class="icon-calendar"></i>&nbsp;&nbsp; <i
						class="fa fa-angle-down"></i>
					<!-- uncomment this to display selected daterange in the button 
							&nbsp; <span class="thin uppercase visible-lg-inline-block"></span>&nbsp;
							<i class="fa fa-angle-down"></i>
							-->
				</div>
			</div>
		</div>
		<!-- END PAGE HEADER-->
		<!-- BEGIN PAGE CONTENT-->
		<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box blue">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-edit"></i>Thông tin
							</div>
							<div class="tools">
								<a href="javascript:;" class="collapse"> </a> <a
									href="#portlet-config" data-toggle="modal" class="config">
								</a> <a href="javascript:;" class="reload"> </a> <a
									href="javascript:;" class="remove"> </a>
							</div>
						</div>
						<div class="portlet-body">
							<div class="table-toolbar">
								<div class="row">
									<div class="col-md-6">
										<div class="btn-group">
											<button class="btn green">
												<a href="${pageContext.request.contextPath }/admin/sanpham-add"
													style="color: white; text-decoration: none;"> Thêm sản phẩm </a>
												<i class="fa fa-plus"></i>
											</button>
										</div>
									</div>
									<div class="col-md-6">
										<div class="btn-group pull-right">
											<button class="btn dropdown-toggle" data-toggle="dropdown">
												Tools <i class="fa fa-angle-down"></i>
											</button>
											<ul class="dropdown-menu pull-right">
												<li><a href="#"> Print </a></li>
												<li><a href="#"> Save as PDF </a></li>
												<li><a href="#"> Export to Excel </a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
							<table class="table table-striped table-hover table-bordered"
								id="sample_editable_1">
								<thead>
									<tr>
										<th>Mã sản phẩm</th>
										<th>Tên sản phẩm</th>
										<th>Số lượng</th>
										<th>Đơn giá</th>
										<th>Mô tả</th>
										<th>Hình ảnh</th>
										<th>Mã loại</th>
										<th>Mã nhà sản xuất</th>
										<th>Edit</th>
										<th>Delete</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listsanpham}" var="a">
										<tr>
											<td>${a.maLinhKien }</td>
											<td>${a.tenLinhKien }</td>
											<td>${a.soLuong }</td>
											<td>${a.donGia } VNĐ</td>
											
											<td>${a.moTa }</td>
											<td>  <img src="${a.linkAnh }" alt="Linh Kien May Tinh" width="80" height="80"></td>
											<!-- <img src="${a.linkAnh }" alt="Linh Kien May Tinh" width="80" height="80"> -->
											<td>${a.maLoai }</td>
											<td>${a.maNSX }</td>
											<!-- <td class="center">power user</td> -->
											<td><a href="${pageContext.request.contextPath }/admin/product/edit?id=${a.maLinhKien }">
													Edit </a></td>
											<td><a href="${pageContext.request.contextPath }/admin/product/delete?id=${a.maLinhKien }">
													Delete </a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<!-- END EXAMPLE TABLE PORTLET-->
				</div>
			</div>
		<!-- END PAGE CONTENT-->
	</div>
</div>

