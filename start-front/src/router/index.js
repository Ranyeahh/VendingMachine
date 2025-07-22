import { createRouter, createWebHistory } from 'vue-router'
import Index from '../pages/IndexPage.vue'
import VendingMachine from '../pages/VendingMachine.vue'

const routes = [
  {
    path: '/',
    name: 'IndexPage',
    component: Index,
  },
  {
    path: '/vending-machine',
    name: 'VendingMachinePage',
    component: VendingMachine,
  },
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
})

export default router
