/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGroupNewResponse extends AbstractModel{

    /**
    * Returns a tree structure
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * Number of uncategorizd instances
    */
    @SerializedName("UnResourceNum")
    @Expose
    private Long UnResourceNum;

    /**
    * Response message
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * Return code. 0: Request successful
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returns a tree structure 
     * @return Data Returns a tree structure
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Returns a tree structure
     * @param Data Returns a tree structure
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get Number of uncategorizd instances 
     * @return UnResourceNum Number of uncategorizd instances
     */
    public Long getUnResourceNum() {
        return this.UnResourceNum;
    }

    /**
     * Set Number of uncategorizd instances
     * @param UnResourceNum Number of uncategorizd instances
     */
    public void setUnResourceNum(Long UnResourceNum) {
        this.UnResourceNum = UnResourceNum;
    }

    /**
     * Get Response message 
     * @return ReturnMsg Response message
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set Response message
     * @param ReturnMsg Response message
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get Return code. 0: Request successful 
     * @return ReturnCode Return code. 0: Request successful
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Return code. 0: Request successful
     * @param ReturnCode Return code. 0: Request successful
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeResourceGroupNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGroupNewResponse(DescribeResourceGroupNewResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.UnResourceNum != null) {
            this.UnResourceNum = new Long(source.UnResourceNum);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "UnResourceNum", this.UnResourceNum);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

