
(function ($) {
    "use strict";


    /*==================================================================
    [ Focus Contact2 ]*/
    $('.input3').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })    
    })
            

    /*==================================================================
    [ Chose Radio ]*/
    
    /*==================================================================
    [ Validate ]*/
    let name = $('.validate-input input[name="name"]');
    let email = $('.validate-input input[name="email"]');
    let phone = $('.validate-input input[name="phone"]');


    $('.validate-form').on('submit',function(){
        let check = true;

        if($(name).val().trim() == ''){
            showValidate(name);
            check=false;
        }


        if($(email).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
            showValidate(email);
            check=false;
        }

        if($(phone).val().trim().match(/^([0-9]{9})$/) ==null){
            showValidate(phone);
            check=false;
        }


        return check;
    })


    $('.validate-form .input3').each(function(){
        $(this).focus(function(){
           hideValidate(this);
       });
    });

    function showValidate(input) {
        let thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        let thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }
    
    

})(jQuery);