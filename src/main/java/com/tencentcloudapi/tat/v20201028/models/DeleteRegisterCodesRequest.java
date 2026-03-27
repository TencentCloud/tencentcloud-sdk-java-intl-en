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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRegisterCodesRequest extends AbstractModel {

    /**
    * Registration code ID list. limits the input registration code ID quantity to more than 0 and less than 100.

Call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
    */
    @SerializedName("RegisterCodeIds")
    @Expose
    private String [] RegisterCodeIds;

    /**
     * Get Registration code ID list. limits the input registration code ID quantity to more than 0 and less than 100.

Call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes. 
     * @return RegisterCodeIds Registration code ID list. limits the input registration code ID quantity to more than 0 and less than 100.

Call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
     */
    public String [] getRegisterCodeIds() {
        return this.RegisterCodeIds;
    }

    /**
     * Set Registration code ID list. limits the input registration code ID quantity to more than 0 and less than 100.

Call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
     * @param RegisterCodeIds Registration code ID list. limits the input registration code ID quantity to more than 0 and less than 100.

Call the [DescribeRegisterCodes](https://www.tencentcloud.com/document/api/1340/96925?from_cn_redirect=1) api to query registration codes.
     */
    public void setRegisterCodeIds(String [] RegisterCodeIds) {
        this.RegisterCodeIds = RegisterCodeIds;
    }

    public DeleteRegisterCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRegisterCodesRequest(DeleteRegisterCodesRequest source) {
        if (source.RegisterCodeIds != null) {
            this.RegisterCodeIds = new String[source.RegisterCodeIds.length];
            for (int i = 0; i < source.RegisterCodeIds.length; i++) {
                this.RegisterCodeIds[i] = new String(source.RegisterCodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegisterCodeIds.", this.RegisterCodeIds);

    }
}

