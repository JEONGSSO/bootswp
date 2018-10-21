<script>
    function wow(){
        let ull = $("#ull li");     		
  		let listArray = Array.from(ull);
        let eArray = listArray.filter ((v) => {
            return v.innerHTML.includes("e");
        });
        return eArray;
        
        }
    </script>