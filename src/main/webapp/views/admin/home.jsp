<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!-- BEGIN CONTENT -->
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
				<li><i class="fa fa-home"></i> <a href="index.html">Trang
						chủ</a> <i class="fa fa-angle-right"></i></li>
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
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 margin-bottom-10">
				<div class="dashboard-stat blue-madison">
					<div class="visual">
						<i class="fa fa-briefcase fa-icon-medium"></i>
					</div>
					<div class="details">
						<div class="number">$168,492.54</div>
						<div class="desc">Tổng danh thu</div>
					</div>
					<a class="more" href="#"> Xem chi tiết <i
						class="m-icon-swapright m-icon-white"></i>
					</a>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="dashboard-stat red-intense">
					<div class="visual">
						<i class="fa fa-shopping-cart"></i>
					</div>
					<div class="details">
						<div class="number">1,127,390</div>
						<div class="desc">Tổng đơn hàng</div>
					</div>
					<a class="more" href="#"> Xem chi tiết <i
						class="m-icon-swapright m-icon-white"></i>
					</a>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="dashboard-stat green-haze">
					<div class="visual">
						<i class="fa fa-group fa-icon-medium"></i>
					</div>
					<div class="details">
						<div class="number">$670.54</div>
						<div class="desc">Giá trị trung bình đơn hàng</div>
					</div>
					<a class="more" href="#"> Xem chi tiết <i
						class="m-icon-swapright m-icon-white"></i>
					</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<!-- Begin: life time stats -->
				<div class="portlet light">
					<div class="portlet-title">
						<div class="caption">
							<i class="icon-bar-chart font-green-sharp"></i> <span
								class="caption-subject font-green-sharp bold uppercase">TỔNG
								QUAN</span> <span class="caption-helper">hàng tuần...</span>
						</div>
						<div class="tools">
							<a href="javascript:;" class="collapse"> </a> <a
								href="#portlet-config" data-toggle="modal" class="config"> </a>
							<a href="javascript:;" class="reload"> </a> <a
								href="javascript:;" class="fullscreen"> </a> <a
								href="javascript:;" class="remove"> </a>
						</div>
					</div>
					<div class="portlet-body">
						<div class="tabbable-line">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#overview_1" data-toggle="tab"
									style="padding: 10px;"> Bán chạy nhất </a></li>
								<li><a href="#overview_2" data-toggle="tab"
									style="padding: 10px;"> Xem nhiều nhất </a></li>
								<li><a href="#overview_3" data-toggle="tab"
									style="padding: 10px;"> Khách Hàng </a></li>
								<li><a href="#overview_4" data-toggle="tab"
									style="padding: 10px;"> Đơn hàng</a></li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="overview_1">
									<div class="table-responsive">
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>
													<th>Tên sản phẩm</th>
													<th>Giá</th>
													<th>Bán</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#"> Apple iPhone 4s - 16GB - Black </a></td>
													<td>$625.50</td>
													<td>809</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Samsung Galaxy S III SGH-I747 -
															16GB </a></td>
													<td>$915.50</td>
													<td>6709</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Motorola Droid 4 XT894 - 16GB -
															Black </a></td>
													<td>$878.50</td>
													<td>784</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Regatta Luca 3 in 1 Jacket </a></td>
													<td>$25.50</td>
													<td>1245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Samsung Galaxy Note 3 </a></td>
													<td>$925.50</td>
													<td>21245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Inoval Digital Pen </a></td>
													<td>$125.50</td>
													<td>1245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Metronic - Responsive Admin +
															Frontend Theme </a></td>
													<td>$20.00</td>
													<td>11190</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="overview_2">
									<div class="table-responsive">
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>
													<th>Tên sản phẩm</th>
													<th>Giá</th>
													<th>Xem</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#"> Metronic - Responsive Admin +
															Frontend Theme </a></td>
													<td>$20.00</td>
													<td>11190</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Regatta Luca 3 in 1 Jacket </a></td>
													<td>$25.50</td>
													<td>1245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Apple iPhone 4s - 16GB - Black </a></td>
													<td>$625.50</td>
													<td>809</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Samsung Galaxy S III SGH-I747 -
															16GB </a></td>
													<td>$915.50</td>
													<td>6709</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Motorola Droid 4 XT894 - 16GB -
															Black </a></td>
													<td>$878.50</td>
													<td>784</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Samsung Galaxy Note 3 </a></td>
													<td>$925.50</td>
													<td>21245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Inoval Digital Pen </a></td>
													<td>$125.50</td>
													<td>1245</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="overview_3">
									<div class="table-responsive">
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>
													<th>Khách hàng</th>
													<th>Tổng đơn hàng</th>
													<th>Tổng cộng</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#"> David Wilson </a></td>
													<td>3</td>
													<td>$625.50</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Amanda Nilson </a></td>
													<td>4</td>
													<td>$12625.50</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Jhon Doe </a></td>
													<td>2</td>
													<td>$125.00</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Bill Chang </a></td>
													<td>45</td>
													<td>$12,125.70</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Paul Strong </a></td>
													<td>1</td>
													<td>$890.85</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Jane Hilson </a></td>
													<td>5</td>
													<td>$239.85</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Patrick Walker </a></td>
													<td>2</td>
													<td>$1239.85</td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="overview_4">
									<div class="table-responsive">
										<table class="table table-striped table-hover table-bordered">
											<thead>
												<tr>
													<th>Khách hàng</th>
													<th>Ngày tháng</th>
													<th>Số lượng</th>
													<th>Trạng thái</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><a href="#"> David Wilson </a></td>
													<td>3 Jan, 2013</td>
													<td>$625.50</td>
													<td><span class="label label-sm label-warning">
															Pending </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Amanda Nilson </a></td>
													<td>13 Feb, 2013</td>
													<td>$12625.50</td>
													<td><span class="label label-sm label-warning">
															Pending </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Jhon Doe </a></td>
													<td>20 Mar, 2013</td>
													<td>$125.00</td>
													<td><span class="label label-sm label-success">
															Success </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Bill Chang </a></td>
													<td>29 May, 2013</td>
													<td>$12,125.70</td>
													<td><span class="label label-sm label-info"> In
															Process </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Paul Strong </a></td>
													<td>1 Jun, 2013</td>
													<td>$890.85</td>
													<td><span class="label label-sm label-success">
															Success </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Jane Hilson </a></td>
													<td>5 Aug, 2013</td>
													<td>$239.85</td>
													<td><span class="label label-sm label-danger">
															Canceled </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
												<tr>
													<td><a href="#"> Patrick Walker </a></td>
													<td>6 Aug, 2013</td>
													<td>$1239.85</td>
													<td><span class="label label-sm label-success">
															Success </span></td>
													<td><a href="#"
														class="btn default btn-xs green-stripe"> Xem </a></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- End: life time stats -->
			</div>
		</div>

		<!-- END PAGE CONTENT-->
	</div>
</div>
<!-- END CONTENT -->
<!-- BEGIN QUICK SIDEBAR -->
<!--Cooming Soon...-->
<!-- END QUICK SIDEBAR -->
</div>