const para = document.querySelector('div');
para.addEventListener('click', updateName);
function updateName() {
    let name = prompt('输入一个新的名字：');
    para.textContent = '玩家1：' + name;
}