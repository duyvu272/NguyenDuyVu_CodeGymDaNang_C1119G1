$( function() {
    $( "#draggable" ).draggable();
} );

$( function() {
    $( "#draggable1" ).draggable();
    $( "#droppable" ).droppable({
        drop: function( event, ui ) {
            $( this )
                .addClass( "ui-state-highlight" )
                .find( "p" )
                .html( "Dropped!" );
        }
    });
} );

$( function() {
    $( "#resizable" ).resizable();
} );

$( function() {
    $( "#selectable" ).selectable();
} );


$( function() {
    $( "#sortable" ).sortable();
    $( "#sortable" ).disableSelection();
} );

$( function() {
    $( "#accordion" ).accordion();
} );

$( function() {
    var availableTags = [
        "ActionScript",
        "AppleScript",
        "Asp",
        "BASIC",
        "C",
        "C++",
        "Clojure",
        "COBOL",
        "ColdFusion",
        "Erlang",
        "Fortran",
        "Groovy",
        "Haskell",
        "Java",
        "JavaScript",
        "Lisp",
        "Perl",
        "PHP",
        "Python",
        "Ruby",
        "Scala",
        "Scheme"
    ];
    $( "#tags" ).autocomplete({
        source: availableTags
    });
} );

$( function() {
    $( "#datepicker" ).datepicker();
} );

$( function() {
    $( "#dialog1" ).dialog();
} );
$( function() {
    $( "#slider" ).slider();
} );
$( function() {
    $( "#progressbar" ).progressbar({
        value: 37
    });
} );

$( function() {
    var spinner = $( "#spinner" ).spinner();

    $( "#disable" ).on( "click", function() {
        if ( spinner.spinner( "option", "disabled" ) ) {
            spinner.spinner( "enable" );
        } else {
            spinner.spinner( "disable" );
        }
    });
    $( "#destroy" ).on( "click", function() {
        if ( spinner.spinner( "instance" ) ) {
            spinner.spinner( "destroy" );
        } else {
            spinner.spinner();
        }
    });
    $( "#getvalue" ).on( "click", function() {
        alert( spinner.spinner( "value" ) );
    });
    $( "#setvalue" ).on( "click", function() {
        spinner.spinner( "value", 5 );
    });

    $( "button" ).button();
} );
$( function() {
    $( "#tabs" ).tabs();
} );
$( function() {
    $( "#button" ).on( "click", function() {
        $( "#effect" ).addClass( "newClass", 1000, callback );
    });

    function callback() {
        setTimeout(function() {
            $( "#effect" ).removeClass( "newClass" );
        }, 1500 );
    }
} );