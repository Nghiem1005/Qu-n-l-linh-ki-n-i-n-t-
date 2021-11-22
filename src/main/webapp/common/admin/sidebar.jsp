<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
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
		<ul class="page-sidebar-menu page-sidebar-menu-hover-submenu "
			data-keep-expanded="false" data-auto-scroll="true"
			data-slide-speed="200">
			<li class="start active "><a href="${pageContext.request.contextPath}/admin/home"> <i
					class="icon-home"></i> <span class="title">Trang Chủ</span> <span
					class="selected"></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/nguoidung"> <i class="icon-users"></i> <span
					class="title">Người Dùng</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/sanpham"> <i class="icon-social-dropbox"></i>
					<span class="title">Sản phẩm</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/loai"> <i class="icon-list"></i>
					<span class="title">Loại</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/nsx"> <i class="icon-pointer"></i>
					<span class="title">Nhà sản xuất</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/donhang"> <i class="icon-notebook"></i> <span
					class="title">Đơn Hàng</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/admin/cart"> <i class="icon-basket"></i> <span
					class="title">Giỏ hàng</span> <span class="arrow "></span>
			</a></li>
			<li><a href="${pageContext.request.contextPath}/home"> <i class="icon-logout"></i> <span
					class="title">Đăng Xuất</span> <span class="arrow "></span>
			</a></li>
			</ul>
			<!-- END SIDEBAR MENU -->
	</div>
</div>
<!-- END SIDEBAR -->