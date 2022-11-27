$(document).on('click', '.page-link', function(e) {

    let pageNum = $(e.currentTarget).data('page')

    // Call Loading
    $('#bookData').html(`
        <div class="text-center">
            ${spinner}
        </div>
    `)

    fetchBookData(pageNum, function(text) {
        $('#bookData').replaceWith(text)
    })
})