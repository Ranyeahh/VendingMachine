// vite.config.js
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

export default defineConfig({
  plugins: [vue()],
  build: {
    outDir: '../mvc-back/src/main/resources/static',
    emptyOutDir: true
  },

  base: './'  // 相对路径，避免路径错误
})
