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
				<li><a href="#">Loại sản phẩm</a> <i class="fa fa-angle-right"></i>
				</li>
				<li><a href="#">Chỉnh sửa</a></li>
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
						<!-- BEGIN VALIDATION STATES-->
						<div class="portlet box purple-plum">
							<div class="portlet-title">
								<div class="caption">
									<i class="fa fa-gift"></i>Sửa thông tin loại sản phẩm
								</div>
								<div class="tools">
									<a href="javascript:;" class="collapse"> </a> <a
										href="#portlet-config" data-toggle="modal" class="config">
									</a> <a href="javascript:;" class="reload"> </a> <a
										href="javascript:;" class="remove"> </a>
								</div>
							</div>
							<div class="portlet-body form">
								<!-- BEGIN FORM-->
								<form action="edit" method="post" id="form_sample_2" class="form-horizontal">
									<div class="form-body">
										<div class="alert alert-danger ${alertmess != null ? "" : "display-hide" }">
											<button class="close" data-close="alert"></button>
											${alertmess }
										</div>
										<div class="alert alert-success display-hide">
											<button class="close" data-close="alert"></button>
											Your form validation is successful!
										</div>
										<div class="form-group">
											<label class="control-label col-md-3">Mã loại <span
												class="required"> * </span>
											</label>
											<div class="col-md-4">
												<div class="input-icon right">
													<i class="fa"></i> <input id="inputID" type="text" class="form-control"
														name="productid" value="${loai.getMaLoai() }" required readonly/>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-3">Tên loại<span
												class="required"> * </span>
											</label>
											<div class="col-md-4">
												<div class="input-icon right">
													<i class="fa"></i> <input id="inputName" type="text" class="form-control"
														name="name" value="${loai.getTenLoai() }" required />
												</div>
											</div>
										</div>										
									</div>
									<div class="form-actions">
										<div class="row">
											<div class="col-md-offset-3 col-md-9">
												<button type="submit" class="btn green">Lưu</button>
												<button type="button" class="btn default">Thoát</button>
											</div>
										</div>
									</div>
								</form>
								<!-- END FORM-->
							</div>
						</div>
						<!-- END VALIDATION STATES-->
					</div>
				</div>
		<!-- END PAGE CONTENT-->
	</div>
</div>