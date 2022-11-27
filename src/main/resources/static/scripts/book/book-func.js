const fetchBookData = (pageNum, callback) => {
    fetch(`/books/tmpl/data?pageNum=${pageNum}`, {
        method: 'GET'
    })
    .then(res => res.text())
    .then(text => {
        if (typeof callback == 'function') {
            callback(text)
        }
    })
}