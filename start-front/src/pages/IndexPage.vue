<template>
  <div class="page-container">
    <div class="content">
      <!-- 售货机图案 -->
      <div class="vending-machine">
        <div class="machine-body">
          <div class="screen">
            <div class="screen-text">欢迎使用</div>
          </div>
          <div class="product-window">
            <div class="product-row">
              <div class="product-slot"></div>
              <div class="product-slot"></div>
              <div class="product-slot"></div>
            </div>
            <div class="product-row">
              <div class="product-slot"></div>
              <div class="product-slot"></div>
              <div class="product-slot"></div>
            </div>
          </div>
          <div class="coin-slot"></div>
          <div class="dispenser"></div>
        </div>
      </div>

      <!-- 开始选购按钮 -->
      <button class="start-button" @click="startShopping">开始选购</button>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    startShopping() {
      this.$router.push({ name: 'VendingMachinePage' })
    },
  },
}
</script>

<style scoped>
body {
  margin: 0;
}
.page-container {
  width: 100%;
  height: 100vh; /* 关键：让它占满整个视口高度 */
  display: flex;
  justify-content: center; /* 水平居中 */
  align-items: center; /* 垂直居中 */
  background-color: #d9ecfd; /* 可选背景色 */
}

.content {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.vending-machine {
  margin-bottom: 40px;
}

.machine-body {
  width: 300px;
  height: 400px;
  background: linear-gradient(45deg, #89cff0, #b9d9eb);
  border-radius: 20px;
  border: 4px solid #5d8aa8;
  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
  position: relative;
  overflow: hidden;
}

.screen {
  width: 200px;
  height: 60px;
  background: #f0f8ff;
  margin: 20px auto;
  border-radius: 10px;
  display: flex;
  align-items: center;
  justify-content: center;
  border: 3px solid #b0c4de;
}

.screen-text {
  color: #4682b4;
  font-family: 'Courier New', monospace;
  font-size: 16px;
  font-weight: bold;
}

.product-window {
  width: 220px;
  height: 200px;
  background: rgba(255, 255, 255, 0.95);
  margin: 20px auto;
  border-radius: 10px;
  padding: 15px;
  border: 2px solid #d8bfd8;
}

.product-row {
  display: flex;
  justify-content: space-between;
  margin-bottom: 15px;
}

.product-slot {
  width: 50px;
  height: 70px;
  background: linear-gradient(45deg, #ffb6c1, #ffc0cb);
  border-radius: 8px;
  border: 2px solid #ffd1dc;
}

.coin-slot {
  width: 80px;
  height: 20px;
  background: #a7c7e7;
  margin: 20px auto 10px;
  border-radius: 10px;
  border: 2px solid #b0c4de;
}

.dispenser {
  width: 120px;
  height: 30px;
  background: #c9e9ff;
  margin: 0 auto;
  border-radius: 15px;
  border: 2px solid #a7c7e7;
}

.start-button {
  font-size: 24px;
  font-weight: bold;
  padding: 20px 60px;
  background: linear-gradient(45deg, #ffb6c1, #ff82ab);
  color: white;
  border: none;
  border-radius: 50px;
  cursor: pointer;
  box-shadow: 0 8px 25px rgba(255, 182, 193, 0.4);
  transition: all 0.3s ease;
  transform: translateY(0);
}

.start-button:hover {
  background: linear-gradient(45deg, #ff82ab, #ff6b8b);
  box-shadow: 0 12px 35px rgba(255, 130, 171, 0.6);
  transform: translateY(-3px);
}

.start-button:active {
  transform: translateY(-1px);
  box-shadow: 0 6px 20px rgba(255, 130, 171, 0.4);
}
</style>
