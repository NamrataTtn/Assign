

$(document).ready(function(){
    var i=0;
//Q1
    console.log("Hello World");

//Q2

    $("#b2").click(function(){

        $("#test").addClass("load");});
//Q3

    $("h4").click(function(){

        $("[class$='new']").css({"color":"blue"});

    });
//Q4
    $(".button123").attr("disabled",true);


//Q5
    $(".target").click(function(){
        $("#main > .target").css({"font-size" : "20px"});
    });

//Q6

    $(".b6").click(function(){
        $(".replaceHtml").replaceWith($(".replacewith").html())});

//Q7
    $("#parent").click(function(){
        $("#parent").append("<br><click class='newClick'>This is new Click element.. !!</click>");


    });

//Q8
//
//     $(".newClick").on('click',function(){
//         $("#parent").append("<br><click class='newClick'>This is new Click element.. !!</click>");
//     });

//Q9



    var el = $("<p></p>",{
        id : "new_id",
        class : "new_class"
    });

    var dropD = $("<br><select><option value='volvo'>Volvo</option><option value='saab'>Saab</option><option value='mercedes'>Mercedes</option><option value='audi'>Audi</option></select>");

    el.appendTo($("body"));

    $("select").change(function(){
        $(".appendHere").append($(this).children("option:selected").val()+"<br>");
    });


//Q10


    $( ".hoverMe" ).hover(
        function() {
            $( this ).append( $(dropD) );
        }
    );

//Q11

    $("a").click(function(e){
        e.preventDefault();
    });




//Q12
    $(".clickPrevent").click(function(){
        $(".l1").hide();
    });
    $(".clickPrevent .l1").click(function(e){
        e.stopPropagation();
    });

//Q13
    var max = -1;
    $( ".b13" ).click(function() {
    $("div").each(function() {
        var h = $(this).height();
        max = h > max ? h : max;
    });
    alert(max);
    });
//Q14

    $( ".buttonColor" ).click(function() {
        $( "td" ).each(function( index, element ) {
            // element == this
            var value1 = Number($( this ).html());
            if (value1 > 10) {
                $( element ).css( "backgroundColor", "yellow" );
            }
        });
    });

//Q15
    $(".button1").click(function(){
    $.ajax({url: "jqq.json",
        dataType : 'json',
        type : "GET",
        success: function(result){
            $(".grab").html("Fetched JSON :"+result+"<br>Name:"+result.name);
            console.log(result);
        }});
});

//Q16

    $(".button2").click(function(){
        $.ajax({url: "jqq.json",
            dataType : "json",
            type : "DELETE",
            success: function(result){
                $('.removeMe').remove();
            }

        });
    });


//Q17

    var width = 720;
    var animationSpeed = 2000;
    var pause = 500;
    var currentSlide = 1;

    var $slider = $('#slider');
    var $slideContainer = $('.slides', $slider);
    var $slides = $('.slide', $slider);

    var interval;

    function startSlider() {
        interval = setInterval(function() {
            $slideContainer.animate({'margin-left': '-='+width}, animationSpeed, function() {
                if (++currentSlide === $slides.length) {
                    currentSlide = 1;
                    $slideContainer.css('margin-left', 0);
                }
            });
        }, pause);
    }
    function pauseSlider() {
        clearInterval(interval);
    }

    $slideContainer
        .on('mouseenter', pauseSlider)
        .on('mouseleave', startSlider);

    startSlider();


});