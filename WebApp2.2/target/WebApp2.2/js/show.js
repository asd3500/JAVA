let show = (sel) => {
    document.querySelectorAll(sel)
        .forEach(node => {
        node.style.transform = 'none'
    })
}

setTimeout(() => {
    show('.hide-left')
    show('.hide-right')    
}, 0)

