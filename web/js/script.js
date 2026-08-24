
document.addEventListener('DOMContentLoaded', () => {
    const searchInput = document.getElementById('searchInput');
    const searchBtn = document.getElementById('searchBtn');
    const allBtn = document.getElementById('allBtn');
    const message = document.getElementById('message');
    const count = document.getElementById('count');
    const productList = document.getElementById('productList');

  
    fetchProducts('https://dummyjson.com/products?limit=30');

    searchBtn.addEventListener('click', () => {
        const query = searchInput.value.trim();

        
        if (query === '') {
            showMessage('검색어를 입력하세요.', 'error');
            return;
        }

       
        if (query.length < 2) {
            showMessage('검색어는 2글자 이상 입력하세요.', 'error');
            return;
        }

       
        const specialCharRegex = /[^a-zA-Z0-9\s]/;
        if (specialCharRegex.test(query)) {
            showMessage('검색어에는 특수문자를 입력할 수 없습니다.', 'error');
            return;
        }

        message.textContent = '';
        fetchProducts(`https://dummyjson.com/products/search?q=phone`, true);
    });

    allBtn.addEventListener('click', () => {
        searchInput.value = '';
        message.textContent = '';
        fetchProducts('https://dummyjson.com/products?limit=30');
    });

    function fetchProducts(url, isSearch = false) {
        fetch(url)
            .then(res => res.json())
            .then(data => {
                const products = data.products;
                displayProducts(products);

                if (isSearch) {
                    if (products.length === 0) {
                        showMessage('검색 결과가 없습니다.', 'info');
                        count.textContent = '';
                    } else {
                        showMessage('검색이 완료되었습니다.', 'success');
                        count.textContent = `검색 결과: ${products.length}개`;
                    }
                } else {
                    count.textContent = `전체 상품 개수: ${products.length}개`;
                }
            })
            .catch(err => {
                console.error(err);
                showMessage('데이터를 불러오는 중 오류가 발생했습니다.', 'error');
            });
    }

  
    function displayProducts(products) {
        productList.innerHTML = '';

        products.forEach(product => {
            const card = document.createElement('div');
            card.className = 'product-card';

           
            let stockClass = '';
            let stockStatus = '';
            if (product.stock < 10) {
                stockClass = 'stock-low';
                stockStatus = `재고 부족 `;
            } else {
                stockClass = 'stock-normal';
                stockStatus = `재고 정상 `;
            }

            card.innerHTML = `
                <img src="${product.thumbnail}" alt="${product.title}">
                <h3>${product.title}</h3>
                <p><strong>카테고리:</strong> ${product.category}</p>
                <p><strong>가격:</strong> $${product.price}</p>
                <p><strong>할인율:</strong> ${product.discountPercentage}%</p>
                <p><strong>평점:</strong> ⭐ ${product.rating}</p>
                <p><strong>재고 상태:</strong> <span class="${stockClass}">${stockStatus}</span></p>
            `;
            productList.appendChild(card);
        });
    }

    
    function showMessage(text, className) {
        message.textContent = text;
        message.className = className;
    }
});
