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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCcnAttributeRequest extends AbstractModel{

    /**
    * The CCN instance ID, such as `ccn-f49l6u0z`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The name of the CCN. The maximum length is 60 characters.
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * The description of the CCN. The maximum length is 100 characters.
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
     * Get The CCN instance ID, such as `ccn-f49l6u0z`. 
     * @return CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN instance ID, such as `ccn-f49l6u0z`.
     * @param CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The name of the CCN. The maximum length is 60 characters. 
     * @return CcnName The name of the CCN. The maximum length is 60 characters.
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set The name of the CCN. The maximum length is 60 characters.
     * @param CcnName The name of the CCN. The maximum length is 60 characters.
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get The description of the CCN. The maximum length is 100 characters. 
     * @return CcnDescription The description of the CCN. The maximum length is 100 characters.
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set The description of the CCN. The maximum length is 100 characters.
     * @param CcnDescription The description of the CCN. The maximum length is 100 characters.
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);

    }
}

