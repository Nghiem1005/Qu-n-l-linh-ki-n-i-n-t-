<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="container">
	<div class="row">
		<div class="col">
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100"
							src="https://thenewxgear.com/wp-content/uploads/2021/07/an515-55-des-6.jpg"
							alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100"
							src="https://www.acervietnam.com.vn/Data/Sites/1/media/tin-t%E1%BB%A9c-2020/88-mua-laptop-gaming-ch%C3%ADnh-h%C3%A3ng-%E1%BB%9F-%C4%91%C3%A2u-t%E1%BB%91t-nh%E1%BA%A5t/acer--1a.jpg"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100"
							src="https://danghaustore.com/wp-content/uploads/2021/05/an515-55-des-1.jpg"
							alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="col-12 col-md-3">
			<div class="card">
				<div class="card-header bg-success text-white text-uppercase">
					<i class="fa fa-heart"></i> Thêm giỏ hàng
				</div>
				<img class="img-fluid border-0"
					src="${best.linkAnh}"
					alt="${best.tenLinhKien}">
				<div class="card-body">
					<h4 class="card-title text-center">
						<a href="product.html" title="View Product">"${best.tenLinhKien}"</a>
					</h4>
					<div class="row">
						<div class="col">
							<p class="btn btn-danger btn-block">${best.donGia} đ</p>
						</div>
						<div class="col">
							<a href="${pageContext.request.contextPath}/sanpham/add_sanpham?pId=${p.getMaLinhKien()}&soluong=1" class="btn btn-success btn-block">Thêm giỏ hàng</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="container mt-3">
	<div class="row">
		<div class="col-sm">
			<div class="card">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-star"></i> Sản phẩm mới nhất
				</div>
				<div class="card-body">
					<div class="row">
						<c:forEach items="${listnew4product}" var="t">
							<div class="col-sm">
								<div class="card">
									<img class="card-img-top" src="${t.linkAnh}"
										alt="${t.tenLinhKien}">
									<div class="card-body">
										<h4 class="card-title">
											<a href="product.html" title="View Product">${t.tenLinhKien}</a>
										</h4>
										<p class="card-text">${t.moTa}</p>
										<div class="row">
											<div class="col">
												<p class="btn btn-danger btn-block">${t.donGia}đ</p>
											</div>
											<div class="col">
												<a href="${pageContext.request.contextPath}/sanpham/add_sanpham?pId=${p.getMaLinhKien()}&soluong=1" class="btn btn-success btn-block">Thêm giỏ hàng </a>
											</div>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="container mt-3 mb-4">
	<div class="row">
		<div class="col-sm">
			<div class="card">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-trophy"></i> Sản phẩm được mua nhiều nhất
				</div>
				<div class="card-body">
					<div class="row">
						<c:forEach items="${listbest4product}" var="t1">
							<div class="col-sm">
								<div class="card">
									<img class="card-img-top" src="${t1.linkAnh}"
										alt="${t1.tenLinhKien}">
									<div class="card-body">
										<h4 class="card-title">
											<a href="product.html" title="View Product">${t1.tenLinhKien}</a>
										</h4>
										<p class="card-text">${t1.moTa}</p>
										<div class="row">
											<div class="col">
												<p class="btn btn-danger btn-block">${t1.donGia}đ</p>
											</div>
											<div class="col">
												<a href="cart.html" class="btn btn-success btn-block">Thêm = đẹp trai
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>