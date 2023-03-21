<template>
    <div>{{ boardData }}</div>

    <div class="container">
        <form action="/board/list" id="frm" method="get">
            <div class="col-md-12 mt-4">
                <!-- <button type="button" class="btn btn-secondary" onclick="fnDelete()">Delete</button>
                <button type="button" class="btn btn-info" onclick="javascript:location.href='/board/write'">Register</button>
                <div class="float-right">
                    <button type="button" class="btn btn-info" onclick="javascript:location.href='/logout'">Logout</button>
                </div> -->
                <table class="table table-striped table-horizontal table-bordered mt-3">
                    <thead class="thead-strong">
                        <tr>
                            <th width="5%"><input type="checkbox" id="chkAll"></th>
                            <th width="10%">No.</th>
                            <th width="">Title.</th>
                            <th width="20%">Writer.</th>
                            <th width="10%">Views.</th>
                            <th width="20%">Reg Time.</th>
                        </tr>
                    </thead>
                    <tbody id="tbody">
                        <tr v-for="(item , i) in boardData" :key="i">
                            <td>
                                <input type="checkbox" name="deleteId" value="">
                            </td>
                            <td>
                                <span>{{ item.id }}</span>
                            </td>
                            <td>
                                <a href=""><span>{{ item.title }}</span></a>
                            </td>
                            <td>
                                <span>{{ item.registerId }}</span>
                            </td>
                            <td>
                                <span>{{ item.readCnt }}</span>
                            </td>
                            <td>
                                <span></span>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <div class="row">
                    <div class="col">
                        <ul class="pagination">
                            <li class="page-item" >
                                <a class="page-link" >
                                    <span class="text-white" ></span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </form>
    </div>

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
                        console.log("boardList res : " + res.data)
                        this.boardData = res.data.list
                        // alert(this.boardData.list[0].title);
                    })
                    .catch(error => {
                        console.log(error)
                    })
            }
            
        }
    }
    </script>