$(document).ready(function () {
    var nbTriggers = 0;
    $('#reg-fname').focusout(function () {
        if (isNaN($('#reg-fname').val())) {
            $("#reg-fname").parent('div').removeClass('has-error');
            $("#reg-fname").parent('div').addClass('has-success').trigger('changeClass');

        } else {
            $("#reg-fname").parent('div').removeClass('has-success');
            $("#reg-fname").parent('div').addClass('has-error');
        }
    });
    $('#reg-lname').focusout(function () {
        if (isNaN($('#reg-lname').val())) {
            $("#reg-lname").parent('div').removeClass('has-error');
            $("#reg-lname").parent('div').addClass('has-success').trigger('changeClass');

        } else {
            $("#reg-lname").parent('div').removeClass('has-success');
            $("#reg-lname").parent('div').addClass('has-error');
        }
    });
    $('#reg-email').focusout(function () {
        if ($('#reg-email').val().match(/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/)) {
            $("#reg-email").parent('div').removeClass('has-error');
            $("#reg-email").parent('div').addClass('has-success').trigger('changeClass');

        } else {
            $("#reg-email").parent('div').removeClass('has-success');
            $("#reg-email").parent('div').addClass('has-error');
        }
    });
    $("#reg-pass").focusout(function () {
        if ($("#reg-pass").val().length <= 6) {
            $("#reg-pass").parent('div').addClass('has-error');
        } else {
            $("#reg-pass").parent('div').removeClass('has-error');
            $("#reg-pass").parent('div').addClass('has-success').trigger('changeClass');
        }
    });
    $('#reg-name').focusout(function () {
        var username = $('#reg-name').val();
        $.ajax({
            type: 'GET',
            url: '/ApplicationIntegrateurGroup38283/checkusername?username=' + username,
            success: function (data) {
                if (data != 'available' && isNaN(username)) {
                    $('#divusername').removeClass('has-error');
                    $('#divusername').addClass('has-success').trigger('changeClass');

                } else {
                    $('#divusername').removeClass('has-success');
                    $('#divusername').addClass('has-error');
                }
            },
            error: function (data) {
                console.log("server error");
            }
        });
    });
    $(':radio').radiocheck();
    $("input[id^=reg-]").each(function () {
        $(this).parent('div').on('changeClass', function () {

            nbTriggers++
            if (nbTriggers >= 6) {
                $('#submit').prop('disabled', false);
            }
        });
    });

    $('#submit').click(function () {
        var beforeEncrypt = $('[name=password]').val();
        if (beforeEncrypt != "") {
            var hash = CryptoJS.SHA1(beforeEncrypt);
            $('[name=password]').val(hash)

        }
    });

});