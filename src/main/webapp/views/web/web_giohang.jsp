<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<div class="container mb-4">
    <div class="row">
        <div class="col-12 d-flex justify-content-center">
            <div class="table-responsive" style="width: 888px;">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col"> </th>
                            <th scope="col" >Sản phẩm</th>
                            <th scope="col" class="text-center">Số lượng</th>
                            <th scope="col" class="text-right">Giá</th>
                            <th> </th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${sessionScope.giohang}" var="map">
                    <c:forEach items="${sanphamgiohang }" var="list">
                        <tr>
                        <c:if test="${map.value.maLinhKien == list.maLinhKien }"> 
                            <td><img class="img-responsive" width="60px" height="60px" src="${list.linkAnh}" /> </td>
                            <td>${list.tenLinhKien} </td>                           
                            <td style="text-align: center;">${map.value.soLuong }</td>
                            <td class="text-right">${map.value.gia }</td>
                            <td class="text-right"><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button> </td>
                        </tr>
                      </c:if>
                      </c:forEach>
                        </c:forEach>
                        <tr>
                            <td></td>
                                                    
                            <td><strong>Tổng tiền</strong></td>
                            <td class="text-right"> 
                            <c:forEach items="${sessionScope.giohang}"
									var="map">
									<c:set var="total"
										value="${total + map.value.gia}" />
								</c:forEach>
								<div class="total-result-in">
									<span>${total } VNĐ</span>
								</div></td>
                            <!-- <td class="text-right"><strong>346,90 €</strong></td> -->
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col mb-2">
            <div class="row d-flex justify-content-center">
                <div class="col-sm-12  col-md-5">
                    <a class="btn btn-lg btn-block btn-success text-uppercase"
						href="${pageContext.request.contextPath }/sanpham?cid=0">Tiếp tục mua hàng</a>
                </div>
                <div class="col-sm-12 col-md-5 text-right">
                    <a class="btn btn-lg btn-block btn-success text-uppercase"
						href="${pageContext.request.contextPath }/thanhtoan">Thanh toán</a>
                </div>
            </div>
        </div>
    </div>
</div>