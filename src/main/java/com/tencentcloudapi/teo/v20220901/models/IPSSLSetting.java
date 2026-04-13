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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPSSLSetting extends AbstractModel {

    /**
    * Operation type, values as follows: <li>bind: bind</li> <li>unbind: unbind</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Domain name of the IP SSL that should be bound.
    */
    @SerializedName("AssociatedDomain")
    @Expose
    private String AssociatedDomain;

    /**
     * Get Operation type, values as follows: <li>bind: bind</li> <li>unbind: unbind</li> 
     * @return Operation Operation type, values as follows: <li>bind: bind</li> <li>unbind: unbind</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type, values as follows: <li>bind: bind</li> <li>unbind: unbind</li>
     * @param Operation Operation type, values as follows: <li>bind: bind</li> <li>unbind: unbind</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Domain name of the IP SSL that should be bound. 
     * @return AssociatedDomain Domain name of the IP SSL that should be bound.
     */
    public String getAssociatedDomain() {
        return this.AssociatedDomain;
    }

    /**
     * Set Domain name of the IP SSL that should be bound.
     * @param AssociatedDomain Domain name of the IP SSL that should be bound.
     */
    public void setAssociatedDomain(String AssociatedDomain) {
        this.AssociatedDomain = AssociatedDomain;
    }

    public IPSSLSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPSSLSetting(IPSSLSetting source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.AssociatedDomain != null) {
            this.AssociatedDomain = new String(source.AssociatedDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AssociatedDomain", this.AssociatedDomain);

    }
}

