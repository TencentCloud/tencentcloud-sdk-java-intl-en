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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCosRechargeRequest extends AbstractModel {

    /**
    * COS import configuration Id.
-Get the cos import configuration Id by [searching for the cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1).
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Log topic Id.
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get COS import configuration Id.
-Get the cos import configuration Id by [searching for the cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1). 
     * @return Id COS import configuration Id.
-Get the cos import configuration Id by [searching for the cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1).
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS import configuration Id.
-Get the cos import configuration Id by [searching for the cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1).
     * @param Id COS import configuration Id.
-Get the cos import configuration Id by [searching for the cos import configuration](https://www.tencentcloud.com/document/product/614/88099?from_cn_redirect=1).
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Log topic Id.
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1). 
     * @return TopicId Log topic Id.
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic Id.
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1).
     * @param TopicId Log topic Id.
- Get the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public DeleteCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCosRechargeRequest(DeleteCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

