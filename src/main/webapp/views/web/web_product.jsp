<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="container">
	<div class="row">
		<div class="col">
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.html">Trang chủ</a></li>
					<li class="breadcrumb-item"><a href="category.html">Sản
							phẩm</a></li>
				</ol>
			</nav>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
		<div class="col-12 col-sm-3">
			<div class="card bg-light mb-3">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-list"></i> Loại sản phẩm
				</div>
				<ul class="list-group category_block">
					<c:forEach items="${listloai }" var="l">
						<li class="list-group-item ${targetactive == l.maLoai ? "active" : ""}"><a
							class="${targetactive == l.maLoai ? "
							text-white" : ""}" href="${pageContext.request.contextPath}/sanpham?cid=${l.maLoai }">${l.tenLoai }</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="card bg-light mb-3">
				<div class="card-header bg-success text-white text-uppercase">Sản
					phẩm mới</div>
				<div class="card-body">
					<img class="img-fluid"
						src="https://dummyimage.com/600x400/55595c/fff" />
					<h5 class="card-title">Product title</h5>
					<p class="card-text">Some quick example text to build on the
						card title and make up the bulk of the card's content.</p>
					<p class="bloc_left_price">99.00 $</p>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="row">
				<c:forEach items="${listallproduct }" var="p">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top" src="${p.linkAnh }"
								alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title">
									<a
										href="${pageContext.request.contextPath}/sanpham/chitiet?p=${p.getMaLinhKien()}"
										title="View Product">${p.tenLinhKien }</a>
								</h4>
								<p class="card-text">${p.moTa }</p>
								<div class="row">
									<div class="col">
										<p class="btn btn-danger btn-block">${p.donGia }đ</p>
									</div>
									<div class="col">
										<a href="#" class="btn btn-success btn-block">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<!-- SHOW LIST LINH KIỆN BY SEARCH THEO TÊN LINH KIỆN -->
				<c:forEach items="${listlinhkiensearch }" var="p">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top" src="${p.linkAnh }"
								alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title">
									<a href="${pageContext.request.contextPath}/sanpham/chitiet?p=${p.getMaLinhKien()}" title="View Product">${p.tenLinhKien }</a>
								</h4>
								<p class="card-text">${p.moTa }</p>
								<div class="row">
									<div class="col">
										<p class="btn btn-danger btn-block">${p.donGia }đ</p>
									</div>
									<div class="col">
										<a href="#" class="btn btn-success btn-block">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				
				<div class="col-12">
					<nav aria-label="...">
						<ul class="pagination">
							<c:if test="${tag>1 }">
								<li class="page-item disabled"><a class="page-link"
									href="sanpham?cid=${targetactive }&index=${tag-1 }">Previous</a></li>
							</c:if>
							<c:forEach begin="1" end="${endP }" var="i">
								<li class="page-item ${tag == i ? "active" : "" }"><a
									class="page-link"
									href="sanpham?cid=${targetactive }&index=${i }">${i }</a></li>
							</c:forEach>
							<c:if test="${tag<endP }">
								<li class="page-item"><a class="page-link"
									href="sanpham?cid=${targetactive }&index=${tag+1 }">Next</a>
								</li>
							</c:if>
						</ul>
					</nav>
				</div>
			</div>
		</div>

	</div>
</div>