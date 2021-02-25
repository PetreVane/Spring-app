<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>undefined</title>
    <meta name="generator" content="Google Web Designer 10.0.2.0105">
    <meta name="template" content="Expandable 3.0.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="gwdpage_style.css" rel="stylesheet" data-version="13" data-exports-type="gwd-page">
    <link href="gwdpagedeck_style.css" rel="stylesheet" data-version="14" data-exports-type="gwd-pagedeck">
    <style type="text/css" id="gwd-lightbox-style">
        .gwd-lightbox {
            overflow: hidden;
        }
    </style>
    <style type="text/css" id="gwd-text-style">
        p {
            margin: 0px;
        }
        h1 {
            margin: 0px;
        }
        h2 {
            margin: 0px;
        }
        h3 {
            margin: 0px;
        }
    </style>
    <style type="text/css">
        html, body {
            width: 100%;
            height: 100%;
            margin: 0px;
        }
        .gwd-page-container {
            position: relative;
            width: 100%;
            height: 100%;
        }
        .gwd-page-content {
            background-color: transparent;
            transform: perspective(1400px) matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
            transform-style: preserve-3d;
            position: absolute;
        }
        .gwd-page-wrapper {
            background-color: rgb(255, 255, 255);
            position: absolute;
            transform: translateZ(0px);
        }
        .page1-content {
            width: 550px;
            height: 400px;
        }
        .gwd-p-o5wq {
            position: absolute;
            left: 69px;
            top: 77px;
            text-align: center;
            color: rgb(95, 112, 141);
        }
        .gwd-p-laq7 {
            position: absolute;
            transform-origin: 50% 50% 0px;
            border-image-source: -webkit-linear-gradient(left, rgb(255, 255, 255) 57%, rgb(0, 0, 0) 100%);
            background-image: -webkit-radial-gradient(center center, circle cover, rgb(210, 218, 223) 99%, rgb(0, 0, 0) 100%);
            text-align: center;
            color: rgb(73, 84, 102);
            width: 234px;
            left: 136px;
            top: 163px;
            height: 41px;
        }
        .gwd-button-549s {
            position: absolute;
            background-image: none;
            background-color: rgb(166, 177, 183);
            border-image-source: none;
            border-image-width: 1;
            border-image-outset: 0;
            border-image-repeat: stretch;
            border-color: transparent;
            color: rgb(244, 246, 244);
            font-weight: bold;
            padding-left: 6px;
            height: 37px;
            transform-origin: 50% 50% 0px;
            text-align: center;
            left: 179px;
            top: 253px;
            width: 175px;
        }
        .gwd-page-magy {
            background-image: none;
            background-color: rgb(226, 232, 226);
        }
    </style>
    <script data-source="googbase_min.js" data-version="4" data-exports-type="googbase" src="googbase_min.js"></script>
    <script data-source="gwd_webcomponents_v1_min.js" data-version="2" data-exports-type="gwd_webcomponents_v1" src="gwd_webcomponents_v1_min.js"></script>
    <script data-source="gwdpage_min.js" data-version="13" data-exports-type="gwd-page" src="gwdpage_min.js"></script>
    <script data-source="gwdpagedeck_min.js" data-version="14" data-exports-type="gwd-pagedeck" src="gwdpagedeck_min.js"></script>
</head>

<body class="document-body">
<gwd-pagedeck class="gwd-page-container" id="pagedeck">
    <gwd-page id="page1" class="gwd-page-wrapper page1-content gwd-lightbox gwd-page-magy" data-gwd-width="550px" data-gwd-height="400px">
        <div class="gwd-page-content page1-content">
            <h1 class="gwd-p-o5wq">Welcome to Registration Page</h1>
            <p class="gwd-p-laq7">Please type in your name</p>
            <button id="button_1" class="gwd-button-549s">Submit</button>
        </div>
    </gwd-page>
</gwd-pagedeck>
<script type="text/javascript" id="gwd-init-code">
    (function() {
        document.body.style.opacity = "0";
        var pageDeck = document.getElementById('pagedeck');
        /**
         * Handles the DOMContentLoaded event. The DOMContentLoaded event is
         * fired when the document has been completely loaded and parsed.
         */

        function handleDomContentLoaded(event) {}

        /**
         * Handles the WebComponentsReady event. This event is fired when all
         * custom elements have been registered and upgraded.
         */
        function handleWebComponentsReady(event) {
            document.body.style.opacity = "";
            setTimeout(function() {
                pageDeck.goToPage(pageDeck.getDefaultPage().id);
            }, 0);
        }

        window.addEventListener('DOMContentLoaded',
            handleDomContentLoaded, false);
        window.addEventListener('WebComponentsReady',
            handleWebComponentsReady, false);
    })();
</script>
</body>

</html>