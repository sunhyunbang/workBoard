<template>
<div>
  <button v-on:click="putBoardWrite">board Write</button>
  <div>Return value : {{ resData }}</div>

  <div class="container">
			<h1>Board View.</h1>
			<form id="frm" action="/board/view/action" method="post" >
				<input type="hidden" name="id" value="">
				<div>
				    <label class="form-label font-weight-bold"><span class="text-danger">* </span>Title.</label>
				    <input type="text"  v-model ="title" >
				</div>
				<div>
			    	<label class="form-label font-weight-bold"><span class="text-danger">* </span>Content.</label>
			    	<textarea  rows="5"  required v-model="content"></textarea>
				</div>
				<div>
				    <label class="form-label font-weight-bold"><span class="text-danger">* </span>Writer.</label>
				    <input type="text"  v-model="registerId">
				</div>
				<div>
					<div class="">

						<button type="button"  v-on:click="putBoardWrite">Edit</button>

					</div>
				</div>
			</form>
		</div>

</div>
</template>
<script>

export default{ 
  name:'',
  components:{},
  data(){
    return{
      title: "",
      content : "",
      registerId : "",

      resData : ""
    };
  },
  setup(){},
  created(){
  },
  mounted(){
    
  },
  unmounted(){},
  methods:{
    putBoardWrite(){
    console.log("before :"+ this.title);
      this.$http
      .post("/api/sample/saveBoard" , {title : this.title , content : this.content , registerId : this.registerId})
      .then(res => {
        console.log("Good!!");
        this.resData = res.data;
      }).then(error => {
        console.log(error);
      })
    }
  }
}
</script>