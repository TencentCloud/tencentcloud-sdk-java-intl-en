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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKmsInstanceRequest extends AbstractModel {

    /**
    * <p>Instance billing type (PREPAID).</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Version type.</p><p>Valid values:</p><ul><li>professional: Professional Edition</li></ul>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>Prepaid instance information.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>Reentrant client ID.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Instance tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>Instance billing type (PREPAID).</p> 
     * @return InstanceChargeType <p>Instance billing type (PREPAID).</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type (PREPAID).</p>
     * @param InstanceChargeType <p>Instance billing type (PREPAID).</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Version type.</p><p>Valid values:</p><ul><li>professional: Professional Edition</li></ul> 
     * @return ProductVersion <p>Version type.</p><p>Valid values:</p><ul><li>professional: Professional Edition</li></ul>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>Version type.</p><p>Valid values:</p><ul><li>professional: Professional Edition</li></ul>
     * @param ProductVersion <p>Version type.</p><p>Valid values:</p><ul><li>professional: Professional Edition</li></ul>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>Prepaid instance information.</p> 
     * @return InstanceChargePrepaid <p>Prepaid instance information.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Prepaid instance information.</p>
     * @param InstanceChargePrepaid <p>Prepaid instance information.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>Reentrant client ID.</p> 
     * @return ClientToken <p>Reentrant client ID.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Reentrant client ID.</p>
     * @param ClientToken <p>Reentrant client ID.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Instance tag.</p> 
     * @return Tags <p>Instance tag.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Instance tag.</p>
     * @param Tags <p>Instance tag.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateKmsInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKmsInstanceRequest(CreateKmsInstanceRequest source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

