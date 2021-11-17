<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8" />
<title>Metronic | Admin Dashboard Template</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/uniform/css/uniform.default.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link
	href="<c:url value="/templates/theme/assets/global/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/fullcalendar/fullcalendar.min.css" />"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/plugins/jqvmap/jqvmap/jqvmap.css"/>"
	rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN PAGE STYLES -->
<link
	href="<c:url value="/templates/theme/assets/admin/pages/css/tasks.css"/>"
	rel="stylesheet" type="text/css" />
<!-- END PAGE STYLES -->
<!-- BEGIN THEME STYLES -->
<!-- DOC: To use 'rounded corners' style just load 'components-rounded.css' stylesheet instead of 'components.css' in the below style tag -->
<link
	href="<c:url value="/templates/theme/assets/global/css/components.css"/>"
	id="style_components" rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/global/css/plugins.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/admin/layout2/css/layout.css"/>"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/templates/theme/assets/admin/layout2/css/themes/grey.css"/>"
	rel="stylesheet" type="text/css" id="style_color" />
<link
	href="<c:url value="/templates/theme/assets/admin/layout2/css/custom.css"/>"
	rel="stylesheet" type="text/css" />
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body
	class="page-boxed page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid page-sidebar-closed-hide-logo">
	<!-- BEGIN HEADER -->
	<%@ include file="/common/admin/header.jsp"%>
	<!-- END HEADER -->
	<div class="clearfix"></div>
	<div class="container">
		<div class="page-container">
			<%@ include file="/common/admin/sidebar.jsp"%>
			<dec:body />
		</div>
		<!-- BEGIN FOOTER -->
		<%@ include file="/common/admin/footer.jsp"%>
		<!-- END FOOTER -->
	</div>
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery-migrate.min.js"/>"
		type="text/javascript"></script>


	<script
		src="<c:url value="/templates/theme/assets/global/plugins/fullcalendar/fullcalendar.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery.sparkline.min.js"/>"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->

	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery-migrate.min.js"/>"
		type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/bootstrap/js/bootstrap.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery.blockui.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/jquery.cokie.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/uniform/jquery.uniform.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"/>"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->


	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script
		src="<c:url value="/templates/theme/assets/global/scripts/metronic.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/admin/layout2/scripts/layout.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/admin/layout2/scripts/demo.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/admin/pages/scripts/index.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/admin/pages/scripts/tasks.js"/>"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/flot/jquery.flot.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/flot/jquery.flot.resize.js"/>"
		type="text/javascript"></script>
	<script
		src="<c:url value="/templates/theme/assets/global/plugins/flot/jquery.flot.categories.js"/>"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="<c:url value="/templates/theme/assets/global/plugins/select2/select2.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/templates/theme/assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/templates/theme/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"/>"></script>
<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="<c:url value="/templates/theme/assets/admin/layout2/scripts/table-editable.js"/>" type="text/javascript"></script>
	
	<script
		src="<c:url value="/templates/theme/assets/admin/pages/scripts/ecommerce-index.js"/>"></script>
	<script>
		jQuery(document).ready(function() {
			Metronic.init(); // init metronic core componets
			Layout.init(); // init layout
			Demo.init(); // init demo features 
			Index.init();
			Index.initDashboardDaterange();
			Index.initJQVMAP(); // init index page's custom scripts
			Index.initCalendar(); // init index page's custom scripts
			Index.initCharts(); // init index page's custom scripts
			Index.initChat();
			Index.initMiniCharts();
			Tasks.initDashboardWidget();
		});
	</script>
	<script>
		jQuery(document).ready(function() {
			Metronic.init(); // init metronic core components
			Layout.init(); // init current layout
			Demo.init(); // init demo features
			EcommerceIndex.init();
		});
	</script>
	<script>
jQuery(document).ready(function() {       
   Metronic.init(); // init metronic core components
Layout.init(); // init current layout
Demo.init(); // init demo features
   TableEditable.init();
});
</script>
	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>