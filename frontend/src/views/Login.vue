<script setup>
import { ref, computed } from "vue";
import { useStore } from "vuex";
import router from "@/router";
import axios from "@/plugins/axios";

const props = defineProps({ test: String });
const emit = defineEmits(["test", "test1"]);

const store = useStore();

let userId = ref(null);
let userPw = ref(null);

let form = ref(false);
let loading = ref(false);
let dialog = ref(false);
let isShow = ref(false);

let rId = ref(null);
let rPw = ref(null);
let rEmail = ref(null);
let rName = ref(null);
let rNickname = ref(null);

// let rId = ref('member');
// let rPw = ref('1234');
// let rEmail = ref('member@mediawill.com');
// let rName = ref('박멤버');
// let rNickname = ref('박멤붜');

const login = async () => {
  try {
    if (!form.value) return;
    loading = true;
    setTimeout(() => (loading = false), 2000);
    // if (!userId.value) {
    //   alert("아이디를 입력해주세요.");
    //   return;
    // }
    // if (!userPw.value) {
    //   alert("비밀번호를 입력해주세요.");
    //   return;
    // }

    const payload = {
      account: userId.value,
      password: userPw.value,
    };
    await store.dispatch("auth/login", payload);

    // 로그인 성공 시 메인화면으로 이동
    await router.push("/board");
  } catch (e) {
    alert(e.response.data);
  }
};
const required = [
  (v) => {
    return !!v || "이 항목은 필수입니다";
  },
];

// function required(v) {
//   return !!v || '이 항목은 필수입니다';
// }

const logout = () => {
  try {
    store.dispatch("auth/logout");
  } catch (e) {
    console.log(e.response.data);
  }
};

const getUser = async () => {
  try {
    const acc = "test123";
    const user = await store.dispatch("auth/getUser", acc);
    console.log("유저 조회 => ", user);
  } catch (e) {
    console.log(e.response.data);
  }
};

const getAdmin = async () => {
  try {
    const acc = "test123";
    const user = await store.dispatch("auth/getAdmin", acc);
    console.log("관리자 조회 => ", user);
  } catch (e) {
    console.log(e.response.data);
  }
};

const registration = async () => {
  try {
    await store.dispatch("auth/register", {
      account: rId.value,
      password: rPw.value,
      nickname: rNickname.value,
      name: rName.value,
      email: rEmail.value,
    });

    alert("회원가입이 완료되었습니다!");
    isShow.value = !isShow.value;
  } catch (e) {
    console.log(e.response.data);
  }
};
</script>

<template>
  <v-sheet class="bg-deep-purple pa-12" rounded height="1000">
    <v-row>
      <v-col cols="8">
        <v-card class="mx-auto mr-10 px-6 py-8" max-width="344" title="로그인">
          <v-form v-model="form" @submit.prevent="login">
            <v-text-field
              v-model="userId"
              :readonly="loading"
              :rules="required"
              class="mb-2"
              clearable
              label="Id"
            ></v-text-field>

            <v-text-field
              v-model="userPw"
              :readonly="loading"
              :rules="required"
              clearable
              label="Password"
              placeholder="비밀번호를 입력하세요"
            ></v-text-field>

            <br />

            <v-btn
              :disabled="!form"
              :loading="loading"
              block
              color="success"
              size="large"
              type="submit"
              variant="elevated"
            >
              로그인
            </v-btn>

            <br />
            <v-btn
              block
              color="yellow"
              size="large"
              variant="elevated"
              @click="isShow = !isShow"
            >
              회원가입
            </v-btn>
          </v-form>
        </v-card>
      </v-col>
      <v-col cols="4" v-show="isShow">
        <v-card class="px-6 py-8" max-width="344" title="회원 가입">
          <v-container>
            <v-text-field
              v-model="rId"
              color="primary"
              label="Id"
              variant="underlined"
              :rules="required"
            ></v-text-field>

            <v-text-field
              v-model="rPw"
              type="password"
              color="primary"
              label="Password"
              placeholder="비밀번호를 입력하세요"
              variant="underlined"
              :rules="required"
            ></v-text-field>

            <v-text-field
              v-model="rEmail"
              color="primary"
              label="Email"
              variant="underlined"
              :rules="required"
            ></v-text-field>

            <v-text-field
              v-model="rName"
              color="primary"
              label="Name"
              variant="underlined"
              :rules="required"
            ></v-text-field>

            <v-text-field
              v-model="rNickname"
              color="primary"
              label="Nick Name"
              variant="underlined"
              :rules="required"
            ></v-text-field>

            <v-checkbox
              color="secondary"
              label="개인정보 수집 이용 동의"
            ></v-checkbox>
          </v-container>

          <v-divider></v-divider>

          <v-card-actions>
            <v-spacer></v-spacer>

            <v-btn color="success" @click="registration">
              회원 가입 완료

              <v-icon icon="mdi-chevron-right" end></v-icon>
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-sheet>
</template>
