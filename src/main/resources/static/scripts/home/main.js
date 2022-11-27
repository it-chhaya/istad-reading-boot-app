$(function() {

    // Call Loading
    $('#bookData').html(`
        <div class="text-center">
            ${spinner}
        </div>
    `)

    // Load Book Data
    fetchBookData(1, function(text) {
        $('#bookData').replaceWith(text)
    })
})