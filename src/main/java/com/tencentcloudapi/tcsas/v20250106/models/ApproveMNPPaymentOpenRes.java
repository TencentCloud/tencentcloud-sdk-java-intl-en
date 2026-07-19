/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveMNPPaymentOpenRes extends AbstractModel {

    /**
    * <p>Execution result of the API operation. Valid values: true: Operation succeeded; false: Operation failed.</p>
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * <p>The unique ID of the mini program payment activation. Used for the API where the superapp actively disables mini program payment.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>Execution result of the API operation. Valid values: true: Operation succeeded; false: Operation failed.</p> 
     * @return Result <p>Execution result of the API operation. Valid values: true: Operation succeeded; false: Operation failed.</p>
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set <p>Execution result of the API operation. Valid values: true: Operation succeeded; false: Operation failed.</p>
     * @param Result <p>Execution result of the API operation. Valid values: true: Operation succeeded; false: Operation failed.</p>
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get <p>The unique ID of the mini program payment activation. Used for the API where the superapp actively disables mini program payment.</p> 
     * @return ID <p>The unique ID of the mini program payment activation. Used for the API where the superapp actively disables mini program payment.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>The unique ID of the mini program payment activation. Used for the API where the superapp actively disables mini program payment.</p>
     * @param ID <p>The unique ID of the mini program payment activation. Used for the API where the superapp actively disables mini program payment.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ApproveMNPPaymentOpenRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveMNPPaymentOpenRes(ApproveMNPPaymentOpenRes source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

