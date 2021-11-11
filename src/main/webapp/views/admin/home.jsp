<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="container">
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
			<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
			<div class="page-sidebar navbar-collapse collapse">
				<!-- BEGIN SIDEBAR MENU -->
				<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
				<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
				<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
				<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
				<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
				<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
				<ul class="page-sidebar-menu page-sidebar-menu-hover-submenu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
					<li class="start active ">
						<a href="index.html">
						<i class="icon-home"></i>
						<span class="title">Trang Chủ</span>
						<span class="selected"></span>
						</a>
					</li>
					<li>
						<a href="javascript:;">
                        <i class="icon-users"></i>
						<span class="title">Người Dùng</span>
						<span class="arrow "></span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="admin_seller.html">
                                Người Bán</a>
                        </li>
                        <li>
                            <a href="admin_user.html">
                            Người Mua</a>
                        </li>
                    </ul>
					</li>
					<li>
						<a href="javascript:;">
						<i class="icon-handbag"></i>
						<span class="title">Sản phẩm</span>
						<span class="arrow "></span>
						</a>
					</li>
					<li>
						<a href="javascript:;">
						<i class="icon-basket"></i>
						<span class="title">Đơn Hàng</span>
						<span class="arrow "></span>
						</a>
					</li>
					<li>
						<a href="javascript:;">
						<i class="icon-paper-plane"></i>
						<span class="title">Phản Hồi</span>
						<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="table_basic.html">
								Người Dùng</a>
							</li>
							<li>
								<a href="table_responsive.html">
								Người Mua</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="javascript:;">
						<i class="icon-present"></i>
						<span class="title">Khuyến Mãi</span>
						<span class="arrow "></span>
						</a>
					</li>
					<li>
						<a href="login.html">
						<i class="icon-logout"></i>
						<span class="title">Đăng Xuất</span>
						<span class="arrow "></span>
						</a>
					</li>
				<!-- END SIDEBAR MENU -->
			</div>
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
								<h4 class="modal-title">Modal title</h4>
							</div>
							<div class="modal-body">
								 Widget settings form goes here
							</div>
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
                    <div class="toggler tooltips" data-container="body" data-placement="left" data-html="true" data-original-title="Click to open advance theme customizer panel">
                        <i class="icon-settings"></i>
                    </div>
                    <div class="toggler-close">
                        <i class="icon-close"></i>
                    </div>
                    <div class="theme-options">
                        <div class="theme-option theme-colors clearfix">
                            <span>
                            THEME COLOR </span>
                            <ul>
                                <li class="color-default current tooltips" data-style="default" data-container="body" data-original-title="Default">
                                </li>
                                <li class="color-grey tooltips" data-style="grey" data-container="body" data-original-title="Grey">
                                </li>
                                <li class="color-blue tooltips" data-style="blue" data-container="body" data-original-title="Blue">
                                </li>
                                <li class="color-dark tooltips" data-style="dark" data-container="body" data-original-title="Dark">
                                </li>
                                <li class="color-light tooltips" data-style="light" data-container="body" data-original-title="Light">
                                </li>
                            </ul>
                        </div>
                        <div class="theme-option">
                            <span>
                            Theme Style </span>
                            <select class="layout-style-option form-control input-small"> 
                                <option value="square" selected="selected">Square corners</option>
                                <option value="rounded">Rounded corners</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Layout </span>
                            <select class="layout-option form-control input-small">
                                <option value="fluid" selected="selected">Fluid</option>
                                <option value="boxed">Boxed</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Header </span>
                            <select class="page-header-option form-control input-small">
                                <option value="fixed" selected="selected">Fixed</option>
                                <option value="default">Default</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Top Dropdown</span>
                            <select class="page-header-top-dropdown-style-option form-control input-small">
                                <option value="light" selected="selected">Light</option>
                                <option value="dark">Dark</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Sidebar Mode</span>
                            <select class="sidebar-option form-control input-small">
                                <option value="fixed">Fixed</option>
                                <option value="default" selected="selected">Default</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Sidebar Style</span>
                            <select class="sidebar-style-option form-control input-small">
                                <option value="default" selected="selected">Default</option>
                                <option value="compact">Compact</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Sidebar Menu </span>
                            <select class="sidebar-menu-option form-control input-small">
                                <option value="accordion" selected="selected">Accordion</option>
                                <option value="hover">Hover</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Sidebar Position </span>
                            <select class="sidebar-pos-option form-control input-small">
                                <option value="left" selected="selected">Left</option>
                                <option value="right">Right</option>
                            </select>
                        </div>
                        <div class="theme-option">
                            <span>
                            Footer </span>
                            <select class="page-footer-option form-control input-small">
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
						<li>
							<i class="fa fa-home"></i>
							<a href="index.html">Trang chủ</a>
							<i class="fa fa-angle-right"></i>
						</li>
					</ul>
					<div class="page-toolbar">
						<div id="dashboard-report-range" class="tooltips btn btn-fit-height btn-sm green-haze btn-dashboard-daterange" data-container="body" data-placement="left" data-original-title="Change dashboard date range">
							<i class="icon-calendar"></i>&nbsp;&nbsp; 
							<i class="fa fa-angle-down"></i>
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
								<div class="number">
									 $168,492.54
								</div>
								<div class="desc">
									 Tổng danh thu
								</div>
							</div>
							<a class="more" href="#">
							Xem chi tiết <i class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="dashboard-stat red-intense">
							<div class="visual">
								<i class="fa fa-shopping-cart"></i>
							</div>
							<div class="details">
								<div class="number">
									 1,127,390
								</div>
								<div class="desc">
									 Tổng đơn hàng
								</div>
							</div>
							<a class="more" href="#">
							Xem chi tiết <i class="m-icon-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="dashboard-stat green-haze">
							<div class="visual">
								<i class="fa fa-group fa-icon-medium"></i>
							</div>
							<div class="details">
								<div class="number">
									 $670.54
								</div>
								<div class="desc">
									 Giá trị trung bình đơn hàng
								</div>
							</div>
							<a class="more" href="#">
							Xem chi tiết <i class="m-icon-swapright m-icon-white"></i>
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
									<i class="icon-bar-chart font-green-sharp"></i>
									<span class="caption-subject font-green-sharp bold uppercase">TỔNG QUAN</span>
									<span class="caption-helper">hàng tuần...</span>
								</div>
								<div class="tools">
									<a href="javascript:;" class="collapse">
									</a>
									<a href="#portlet-config" data-toggle="modal" class="config">
									</a>
									<a href="javascript:;" class="reload">
									</a>
									<a href="javascript:;" class="fullscreen">
									</a>
									<a href="javascript:;" class="remove">
									</a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="tabbable-line">
									<ul class="nav nav-tabs">
										<li class="active">
											<a href="#overview_1" data-toggle="tab" style="padding: 10px;">
											Bán chạy nhất </a>
										</li>
										<li>
											<a href="#overview_2" data-toggle="tab" style="padding: 10px;">
											Xem nhiều nhất </a>
										</li>
										<li>
											<a href="#overview_3" data-toggle="tab" style="padding: 10px;">
											Khách Hàng </a>
										</li>
										<li>
											<a href="#overview_4" data-toggle="tab" style="padding: 10px;">
											Đơn hàng</a>
										</li>
									</ul>
									<div class="tab-content">
										<div class="tab-pane active" id="overview_1">
											<div class="table-responsive">
												<table class="table table-striped table-hover table-bordered">
												<thead>
												<tr>
													<th>
														Tên sản phẩm
													</th>
													<th>
														Giá
													</th>
													<th>
														Bán
													</th>
													<th>
													</th>
												</tr>
												</thead>
												<tbody>
												<tr>
													<td>
														<a href="#">
														Apple iPhone 4s - 16GB - Black </a>
													</td>
													<td>
														 $625.50
													</td>
													<td>
														 809
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Samsung Galaxy S III SGH-I747 - 16GB </a>
													</td>
													<td>
														 $915.50
													</td>
													<td>
														 6709
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Motorola Droid 4 XT894 - 16GB - Black </a>
													</td>
													<td>
														 $878.50
													</td>
													<td>
														 784
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Regatta Luca 3 in 1 Jacket </a>
													</td>
													<td>
														 $25.50
													</td>
													<td>
														 1245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Samsung Galaxy Note 3 </a>
													</td>
													<td>
														 $925.50
													</td>
													<td>
														 21245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Inoval Digital Pen </a>
													</td>
													<td>
														 $125.50
													</td>
													<td>
														 1245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Metronic - Responsive Admin + Frontend Theme </a>
													</td>
													<td>
														 $20.00
													</td>
													<td>
														 11190
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
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
													<th>
														 Tên sản phẩm
													</th>
													<th>
														 Giá
													</th>
													<th>
														Xem
													</th>
													<th>
													</th>
												</tr>
												</thead>
												<tbody>
												<tr>
													<td>
														<a href="#">
														Metronic - Responsive Admin + Frontend Theme </a>
													</td>
													<td>
														 $20.00
													</td>
													<td>
														 11190
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Regatta Luca 3 in 1 Jacket </a>
													</td>
													<td>
														 $25.50
													</td>
													<td>
														 1245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Apple iPhone 4s - 16GB - Black </a>
													</td>
													<td>
														 $625.50
													</td>
													<td>
														 809
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Samsung Galaxy S III SGH-I747 - 16GB </a>
													</td>
													<td>
														 $915.50
													</td>
													<td>
														 6709
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Motorola Droid 4 XT894 - 16GB - Black </a>
													</td>
													<td>
														 $878.50
													</td>
													<td>
														 784
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Samsung Galaxy Note 3 </a>
													</td>
													<td>
														 $925.50
													</td>
													<td>
														 21245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Inoval Digital Pen </a>
													</td>
													<td>
														 $125.50
													</td>
													<td>
														 1245
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
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
													<th>
														Khách hàng
													</th>
													<th>
														 Tổng đơn hàng
													</th>
													<th>
														 Tổng cộng
													</th>
													<th>
													</th>
												</tr>
												</thead>
												<tbody>
												<tr>
													<td>
														<a href="#">
														David Wilson </a>
													</td>
													<td>
														 3
													</td>
													<td>
														 $625.50
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Amanda Nilson </a>
													</td>
													<td>
														 4
													</td>
													<td>
														 $12625.50
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Jhon Doe </a>
													</td>
													<td>
														 2
													</td>
													<td>
														 $125.00
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Bill Chang </a>
													</td>
													<td>
														 45
													</td>
													<td>
														 $12,125.70
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Paul Strong </a>
													</td>
													<td>
														 1
													</td>
													<td>
														 $890.85
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Jane Hilson </a>
													</td>
													<td>
														 5
													</td>
													<td>
														 $239.85
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Patrick Walker </a>
													</td>
													<td>
														 2
													</td>
													<td>
														 $1239.85
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
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
													<th>
														Khách hàng
													</th>
													<th>
														 Ngày tháng
													</th>
													<th>
														 Số lượng
													</th>
													<th>
														 Trạng thái
													</th>
													<th>
													</th>
												</tr>
												</thead>
												<tbody>
												<tr>
													<td>
														<a href="#">
														David Wilson </a>
													</td>
													<td>
														 3 Jan, 2013
													</td>
													<td>
														 $625.50
													</td>
													<td>
														<span class="label label-sm label-warning">
														Pending </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Amanda Nilson </a>
													</td>
													<td>
														 13 Feb, 2013
													</td>
													<td>
														 $12625.50
													</td>
													<td>
														<span class="label label-sm label-warning">
														Pending </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Jhon Doe </a>
													</td>
													<td>
														 20 Mar, 2013
													</td>
													<td>
														 $125.00
													</td>
													<td>
														<span class="label label-sm label-success">
														Success </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Bill Chang </a>
													</td>
													<td>
														 29 May, 2013
													</td>
													<td>
														 $12,125.70
													</td>
													<td>
														<span class="label label-sm label-info">
														In Process </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Paul Strong </a>
													</td>
													<td>
														 1 Jun, 2013
													</td>
													<td>
														 $890.85
													</td>
													<td>
														<span class="label label-sm label-success">
														Success </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Jane Hilson </a>
													</td>
													<td>
														 5 Aug, 2013
													</td>
													<td>
														 $239.85
													</td>
													<td>
														<span class="label label-sm label-danger">
														Canceled </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
												</tr>
												<tr>
													<td>
														<a href="#">
														Patrick Walker </a>
													</td>
													<td>
														 6 Aug, 2013
													</td>
													<td>
														 $1239.85
													</td>
													<td>
														<span class="label label-sm label-success">
														Success </span>
													</td>
													<td>
														<a href="#" class="btn default btn-xs green-stripe">
														Xem </a>
													</td>
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
				<div class="row">
					<div class="col-md-6 col-sm-6">
						<div class="portlet light ">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-share font-blue-steel hide"></i>
									<span class="caption-subject font-blue-steel bold uppercase">Feedbacks</span>
								</div>
							</div>
							<div class="portlet-body">
								<div class="scroller" style="height: 300px;" data-always-visible="1" data-rail-visible="0">
									<ul class="feeds">
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Mạnh.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 20 phút
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Mạnh.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Mạnh.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Mạnh.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Mạnh.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
										<li>
											<div class="col1">
												<div class="cont">
													<div class="cont-col1">
														<div class="label label-sm label-info">
															<i class="fa fa-comments"></i>
														</div>
													</div>
													<div class="cont-col2">
														<div class="desc">
															 Bạn mới feedbacks mới của Hiếu.
														</div>
													</div>
												</div>
											</div>
											<div class="col2">
												<div class="date">
													 Bây giờ
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-sm-6">
						<div class="portlet light">
							<div class="portlet-title tabbable-line">
								<div class="caption">
									<i class="icon-globe font-green-sharp"></i>
									<span class="caption-subject font-green-sharp bold uppercase">Thông tin</span>
								</div>
								<ul class="nav nav-tabs">
									<li class="active">
										<a href="#tab_1_2" data-toggle="tab">
										Hoạt động gần đây </a>
									</li>
									<li>
										<a href="#tab_1_3" data-toggle="tab">
										Người dùng mới </a>
									</li>
								</ul>
							</div>
							<div class="portlet-body">
								<!--BEGIN TABS-->
								<div class="tab-content">
									<div class="tab-pane active" id="tab_1_2">
										<div class="scroller" style="height: 300px;" data-always-visible="1" data-rail-visible1="1">
											<ul class="feeds">
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-user"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Người dùng đăng ký mới
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 Bây giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-file-text"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Đơn hàng mới hoàn thành
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 20 phút
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-user"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Người dùng đăng ký mới
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 Bây giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-user"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Người dùng đăng ký mới
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 Bây giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-user"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Người dùng đăng ký mới
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 Bây giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-file-text"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Đơn hàng mới hoàn thành
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 20 phút
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-file-text"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Đơn hàng mới hoàn thành
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 20 phút
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-cubes"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Sản phẩm mới được thêm vào
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 1 giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-cubes"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Sản phẩm mới được thêm vào
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 1 giờ
														</div>
													</div>
													</a>
												</li>
												<li>
													<a href="#">
													<div class="col1">
														<div class="cont">
															<div class="cont-col1">
																<div class="label label-sm label-success">
																	<i class="fa fa-cubes"></i>
																</div>
															</div>
															<div class="cont-col2">
																<div class="desc">
																	 Sản phẩm mới được thêm vào
																</div>
															</div>
														</div>
													</div>
													<div class="col2">
														<div class="date">
															 1 giờ
														</div>
													</div>
													</a>
												</li>
											</ul>
										</div>
									</div>
									<div class="tab-pane" id="tab_1_3">
										<div class="scroller" style="height: 290px;" data-always-visible="1" data-rail-visible1="1">
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Robert Nilson </a>
														</div>
														<div>
															 29 Jan 2013 10:45AM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 10:45AM
														</div>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Eric Kim </a>
														</div>
														<div>
															 19 Jan 2013 12:45PM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 11:55PM
														</div>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Eric Kim </a>
														</div>
														<div>
															 19 Jan 2013 12:45PM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 11:55PM
														</div>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Eric Kim </a>
														</div>
														<div>
															 19 Jan 2013 12:45PM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 11:55PM
														</div>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Eric Kim </a>
														</div>
														<div>
															 19 Jan 2013 12:45PM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 11:55PM
														</div>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Eric Kim </a>
														</div>
														<div>
															 19 Jan 2013 12:45PM
														</div>
													</div>
												</div>
												<div class="col-md-6 user-info">
													<img alt="" src="../../assets/admin/layout2/img/avatar.png" class="img-responsive"/>
													<div class="details">
														<div>
															<a href="#">
															Lisa Miller </a>
														</div>
														<div>
															 19 Jan 2013 11:55PM
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!--END TABS-->
							</div>
						</div>
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
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="page-footer">
		<div class="page-footer-inner">
			 2014 &copy; Metronic by keenthemes.
		</div>
		<div class="scroll-to-top">
			<i class="icon-arrow-up"></i>
		</div>
	</div>
	<!-- END FOOTER -->
</div>