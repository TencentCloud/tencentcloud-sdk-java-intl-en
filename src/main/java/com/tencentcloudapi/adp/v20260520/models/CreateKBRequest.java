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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKBRequest extends AbstractModel {

    /**
    * <p>Knowledge base type (0 not allowed. Parameter Value: 1=default knowledge base, 2=shared knowledge base)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
    */
    @SerializedName("KbType")
    @Expose
    private Long KbType;

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Writable attribute</p>
    */
    @SerializedName("Spec")
    @Expose
    private KBSpec Spec;

    /**
    * <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat Official Account</td></tr></tbody></table></p>
    */
    @SerializedName("SharedSubType")
    @Expose
    private Long SharedSubType;

    /**
     * Get <p>Knowledge base type (0 not allowed. Parameter Value: 1=default knowledge base, 2=shared knowledge base)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p> 
     * @return KbType <p>Knowledge base type (0 not allowed. Parameter Value: 1=default knowledge base, 2=shared knowledge base)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     */
    public Long getKbType() {
        return this.KbType;
    }

    /**
     * Set <p>Knowledge base type (0 not allowed. Parameter Value: 1=default knowledge base, 2=shared knowledge base)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     * @param KbType <p>Knowledge base type (0 not allowed. Parameter Value: 1=default knowledge base, 2=shared knowledge base)<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>Default knowledge base</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>Shared knowledge base</td></tr></tbody></table></p>
     */
    public void setKbType(Long KbType) {
        this.KbType = KbType;
    }

    /**
     * Get <p>Workspace ID</p> 
     * @return SpaceId <p>Workspace ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param SpaceId <p>Workspace ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Writable attribute</p> 
     * @return Spec <p>Writable attribute</p>
     */
    public KBSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>Writable attribute</p>
     * @param Spec <p>Writable attribute</p>
     */
    public void setSpec(KBSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat Official Account</td></tr></tbody></table></p> 
     * @return SharedSubType <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat Official Account</td></tr></tbody></table></p>
     */
    public Long getSharedSubType() {
        return this.SharedSubType;
    }

    /**
     * Set <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat Official Account</td></tr></tbody></table></p>
     * @param SharedSubType <p>Share sub-type: 1=ordinary, 2=wechat official account<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>Ordinary</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>WeChat Official Account</td></tr></tbody></table></p>
     */
    public void setSharedSubType(Long SharedSubType) {
        this.SharedSubType = SharedSubType;
    }

    public CreateKBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKBRequest(CreateKBRequest source) {
        if (source.KbType != null) {
            this.KbType = new Long(source.KbType);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Spec != null) {
            this.Spec = new KBSpec(source.Spec);
        }
        if (source.SharedSubType != null) {
            this.SharedSubType = new Long(source.SharedSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbType", this.KbType);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "SharedSubType", this.SharedSubType);

    }
}

