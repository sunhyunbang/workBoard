<template>
    <div>{{ boardData }}</div>
    </template>
  
    <script>
    
    export default{ 
        name:'',
        components:{},
        data(){
            return{
                boardData:''
            };
        },
        setup(){},
        created(){
            this.getBoardList()
        },
        mounted(){},
        unmounted(){},
        methods:{
            getBoardList(){
                this.$http
                    .get("/api/sample/boardList")
                    .then(res => {
                        console.log(res.data)
                        this.boardData = res.data
                    })
                    .catch(error => {
                        console.log(error)
                    })
            }
            
        }
    }
    </script>