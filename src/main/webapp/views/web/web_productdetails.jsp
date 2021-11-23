<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="container">
    <div class="row">
        <div class="col">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="/">Trang chủ</a></li>
                    <li class="breadcrumb-item"><a href="category.html">Sản phẩm</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Chi tiết</li>
                </ol>
            </nav>
        </div>
    </div>
</div>
<div class="container">
    <div class="row d-flex align-items-center">
        <!-- Image -->
        <div class="col-12 col-lg-6">
            <div class="card bg-light mb-3">
                <div class="card-body">                   
                    <img class="img-fluid" src="${product.getLinkAnh() }"/>                   
                </div>
            </div>
        </div>

        <!-- Add to cart -->
        <div class="col-12 col-lg-6 add_to_cart_block">
            <div class="card bg-light mb-3">
                <div class="card-body">
                    <p class="price" style="margin-bottom: 40px; margin-top: 20px;">${product.getDonGia()} VND</p>
                    <form method="get" action="add_sanpham" style="margin-bottom: 35px;">
                        <div class="form-group" style="margin-bottom: 30px;">
                            <label>${product.getSoLuong()}</label>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <button id="giam" onclick="tanggiam(0)" type="button" class="quantity-left-minus btn btn-danger btn-number"  data-type="minus" data-field="">
                                        <i class="fa fa-minus"></i>
                                    </button>
                                </div>
                                <input type="text" class="form-control"  id="quantity" name="soluong" min="1" max="100" value="1">
                                <div class="input-group-append">
                                    <button id="tang" onclick="tanggiam(1)" type="button" class="quantity-right-plus btn btn-success btn-number" data-type="plus" data-field="">
                                        <i class="fa fa-plus"></i>
                                    </button>
                                </div>
                                <input type="text" class="form-control"  id="pID" name="pId" min="1" max="100" value="${product.maLinhKien }" hidden>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-success btn-lg btn-block text-uppercase">
                            <i class="fa fa-shopping-cart"></i> Add to cart
                        </button>
                    </form>
                    <div class="product_rassurance" style="margin-bottom: 20px;">
                        <ul class="list-inline">
                            <li class="list-inline-item"><i class="fa fa-truck fa-2x"></i><br/>Fast delivery</li>
                            <li class="list-inline-item"><i class="fa fa-credit-card fa-2x"></i><br/>Secure payment</li>
                            <li class="list-inline-item"><i class="fa fa-phone fa-2x"></i><br/>+33 1 22 54 65 60</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <!-- Description -->
        <div class="col-12">
            <div class="card border-light mb-3">
                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-align-justify"></i> Mô tả</div>
                <div class="card-body">
                    <p class="card-text">
                        ${product.getMoTa() }
                    </p>
                    
                </div>
            </div>
        </div>

        
    </div>
</div>