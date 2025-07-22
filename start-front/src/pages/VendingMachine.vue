<template>
  <div class="page-container">
    <div class="machine">
      <h1 class="title">请选择饮料</h1>

      <!-- 饮料选择区域 -->
      <div class="drinks-section">
        <div class="drink-card" :class="{ active: type === 'coca' }" @click="type = 'coca'">
          <div class="drink-icon coca-icon">🥤</div>
          <span class="drink-name">可乐</span>
        </div>
        <div class="drink-card" :class="{ active: type === 'coffee' }" @click="type = 'coffee'">
          <div class="drink-icon coffee-icon">☕</div>
          <span class="drink-name">咖啡</span>
        </div>
      </div>

      <h2 class="section-title">请选择配料</h2>

      <!-- 配料选择区域 -->
      <div class="decorators-section">
        <div
          class="decorator-card"
          :class="{ active: decorators.length === 0 }"
          @click="clearDecorators"
        >
          <div class="decorator-icon">🚫</div>
          <span class="decorator-name">不添加</span>
        </div>
        <div
          class="decorator-card"
          :class="{ active: decorators.includes('milk') }"
          @click="toggleDecorator('milk')"
        >
          <div class="decorator-icon">🥛</div>
          <span class="decorator-name">牛奶</span>
        </div>
        <div
          class="decorator-card"
          :class="{ active: decorators.includes('ice') }"
          @click="toggleDecorator('ice')"
        >
          <div class="decorator-icon">🧊</div>
          <span class="decorator-name">冰块</span>
        </div>
      </div>

      <!-- 提交按钮 -->
      <button class="submit-btn" @click="submitOrder">选择完毕，提交订单</button>

      <!-- 订单结果 -->
      <div v-if="result" class="result-section">
        <div class="amount">总金额：{{ result.price }} 元</div>
        <div class="thanks">谢谢惠顾</div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
    return {
      type: 'coffee',
      decorators: [],
      result: null,
    }
  },
  methods: {
    async submitOrder() {
      try {
        const response = await axios.post('http://localhost:8080/api/beverage/make', {
          type: this.type,
          decorators: this.decorators,
        })
        this.result = response.data
      } catch (error) {
        console.error('请求失败', error)
      }
    },
    toggleDecorator(decorator) {
      if (this.decorators.includes(decorator)) {
        this.decorators = this.decorators.filter((d) => d !== decorator)
      } else {
        this.decorators.push(decorator)
      }
    },
    clearDecorators() {
      this.decorators = []
    },
  },
}
</script>

<style scoped>
.page-container {
  height: 100vh; /* 高度占满整个视口 */
  display: flex;
  justify-content: center; /* 水平居中 */
  align-items: center; /* 垂直居中 */
  background-color: #d9ecfd; /* 可选：页面背景色，柔和一点 */
}

.machine {
  padding: 30px;
  max-width: 500px;
  margin: 0 auto;
  background: linear-gradient(135deg, #89cff0 0%, #b9d9eb 100%); /* 浅蓝色渐变 */
  border-radius: 20px;
  box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
  color: #5d8aa8; /* 钢蓝色文字 */
  font-family: 'Arial', sans-serif;
  border: 3px solid #a7c7e7; /* 淡蓝色边框 */
}

.title {
  text-align: center;
  font-size: 28px;
  font-weight: bold;
  margin-bottom: 30px;
  color: #4682b4; /* 钢蓝色 */
  text-shadow: 1px 1px 2px rgba(255, 255, 255, 0.5);
}

.section-title {
  text-align: center;
  font-size: 20px;
  margin: 30px 0 20px 0;
  font-weight: bold;
  color: #5d8aa8; /* 钢蓝色 */
}

.drinks-section {
  display: flex;
  justify-content: center;
  gap: 30px;
  margin-bottom: 20px;
}

.decorators-section {
  display: flex;
  justify-content: center;
  gap: 20px;
  margin-bottom: 30px;
  flex-wrap: wrap;
}

.drink-card,
.decorator-card {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
  background: rgba(255, 255, 255, 0.8); /* 半透明白色 */
  border-radius: 15px;
  cursor: pointer;
  transition: all 0.3s ease;
  backdrop-filter: blur(5px);
  border: 2px solid #d8bfd8; /* 蓟色边框 */
  min-width: 80px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}

.drink-card:hover,
.decorator-card:hover {
  transform: translateY(-5px);
  background: rgba(255, 255, 255, 0.9);
  box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
}

.drink-card.active,
.decorator-card.active {
  border-color: #ff82ab; /* 粉色边框 */
  background: rgba(255, 182, 193, 0.3); /* 浅粉色背景 */
  transform: scale(1.05);
}

.drink-icon,
.decorator-icon {
  font-size: 40px;
  margin-bottom: 10px;
  color: #4682b4; /* 钢蓝色图标 */
}

.drink-name,
.decorator-name {
  font-size: 16px;
  font-weight: bold;
  text-align: center;
  color: #5d8aa8; /* 钢蓝色文字 */
}

.submit-btn {
  display: block;
  width: 100%;
  padding: 15px;
  font-size: 18px;
  font-weight: bold;
  color: white;
  background: linear-gradient(45deg, #ffb6c1, #ff82ab); /* 粉色渐变 */
  border: none;
  border-radius: 25px;
  cursor: pointer;
  transition: all 0.3s ease;
  box-shadow: 0 4px 15px rgba(255, 130, 171, 0.4);
}

.submit-btn:hover {
  transform: translateY(-2px);
  box-shadow: 0 6px 20px rgba(255, 130, 171, 0.6);
}

.result-section {
  margin-top: 30px;
  text-align: center;
  animation: fadeIn 0.5s ease-in;
}

.amount {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 15px;
  color: #ff82ab; /* 粉色 */
}

.thanks {
  font-size: 20px;
  font-weight: bold;
  color: #89cff0; /* 浅蓝色 */
}

@keyframes fadeIn {
  from {
    opacity: 0;
    transform: translateY(20px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@media (max-width: 480px) {
  .machine {
    padding: 20px;
    margin: 10px;
  }

  .drinks-section {
    gap: 20px;
  }

  .decorators-section {
    gap: 15px;
  }

  .drink-card,
  .decorator-card {
    min-width: 70px;
    padding: 15px;
  }

  .drink-icon,
  .decorator-icon {
    font-size: 35px;
  }
}
</style>
