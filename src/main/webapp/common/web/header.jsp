<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<div class="container">
		<a class="navbar-brand" href="#"> <img
			src="https://cdn.iconscout.com/icon/premium/png-256-thumb/gaming-2802503-2322767.png" width="50"
			height="50" class="d-inline-block align-top" alt=""> Bootstrap
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/home">Trang chủ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/sanpham">Sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="product.html">Màn hình</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact.html">CPU</a>
                </li>
                <li class="nav-item">
                	<c:choose>
		                <c:when test="${sessionScope.userInfo == null}">
			                <li class="nav-item"> 
			                  <a class="nav-link" href="${pageContext.request.contextPath }/login">Đăng nhập</a>
			                </li>
		                </c:when>
		                <c:otherwise>
		                	<li class="nav-item"> 
								<a class="nav-link" href="${pageContext.request.contextPath }/profile">${sessionScope.userInfo.getTentk()}</a>
							</li>
							<c:if test="${sessionScope.userInfo.getQuyen()== 'admin' }">
		                		<li class="nav-item"> 
		                			<a class="nav-link" href="${pageContext.request.contextPath }/admin/home">Quản lý</a>
		                		</li>
		                	</c:if>
		                	<li class="nav-item"> 
								<a class="nav-link" href="${pageContext.request.contextPath }/logout">Đăng xuất</a>
		                	</li>
		                </c:otherwise>
            		</c:choose>
                    
                </li>
            </ul>

			<form class="form-inline my-2 my-lg-0" action="sanpham-search">
				<div class="input-group input-group-sm">
					<input type="text" class="form-control" value="${txtS}" placeholder="Search something..." name="txtsearch">
					<div class="input-group-append">
						<button type="submit" class="btn btn-secondary btn-number">
							<i class="fa fa-search"></i>
						</button>
					</div>
				</div>
				<a class="btn btn-success btn-sm ml-3" href="cart.html"> <i
					class="fa fa-shopping-cart"></i> Giỏ hàng <span
					class="badge badge-light">3</span>
				</a>
			</form>
		</div>
	</div>
</nav>

<section class="jumbotron text-center" style="padding: 0px;">
	<div id="slider"></div>
</section>