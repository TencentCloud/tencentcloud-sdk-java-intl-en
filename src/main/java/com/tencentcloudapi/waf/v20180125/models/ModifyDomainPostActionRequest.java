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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainPostActionRequest extends AbstractModel {

    /**
    * www.tx.com
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 0- Disable shipping, 1- Enable shipping
    */
    @SerializedName("PostCLSAction")
    @Expose
    private Long PostCLSAction;

    /**
    * 0- Disable shipping, 1- Enable shipping
    */
    @SerializedName("PostCKafkaAction")
    @Expose
    private Long PostCKafkaAction;

    /**
     * Get www.tx.com 
     * @return Domain www.tx.com
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set www.tx.com
     * @param Domain www.tx.com
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 0- Disable shipping, 1- Enable shipping 
     * @return PostCLSAction 0- Disable shipping, 1- Enable shipping
     */
    public Long getPostCLSAction() {
        return this.PostCLSAction;
    }

    /**
     * Set 0- Disable shipping, 1- Enable shipping
     * @param PostCLSAction 0- Disable shipping, 1- Enable shipping
     */
    public void setPostCLSAction(Long PostCLSAction) {
        this.PostCLSAction = PostCLSAction;
    }

    /**
     * Get 0- Disable shipping, 1- Enable shipping 
     * @return PostCKafkaAction 0- Disable shipping, 1- Enable shipping
     */
    public Long getPostCKafkaAction() {
        return this.PostCKafkaAction;
    }

    /**
     * Set 0- Disable shipping, 1- Enable shipping
     * @param PostCKafkaAction 0- Disable shipping, 1- Enable shipping
     */
    public void setPostCKafkaAction(Long PostCKafkaAction) {
        this.PostCKafkaAction = PostCKafkaAction;
    }

    public ModifyDomainPostActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainPostActionRequest(ModifyDomainPostActionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.PostCLSAction != null) {
            this.PostCLSAction = new Long(source.PostCLSAction);
        }
        if (source.PostCKafkaAction != null) {
            this.PostCKafkaAction = new Long(source.PostCKafkaAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PostCLSAction", this.PostCLSAction);
        this.setParamSimple(map, prefix + "PostCKafkaAction", this.PostCKafkaAction);

    }
}

