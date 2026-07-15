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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmailIdentityRequest extends AbstractModel {

    /**
    * <p>For your sender domain name, recommend using a level 3 or higher domain name. Example: mail.qcloud.com.</p>
    */
    @SerializedName("EmailIdentity")
    @Expose
    private String EmailIdentity;

    /**
    * <p>Generated dkim key length. 0:1024, 1:2048</p>
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
    * <p>tag</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
     * Get <p>For your sender domain name, recommend using a level 3 or higher domain name. Example: mail.qcloud.com.</p> 
     * @return EmailIdentity <p>For your sender domain name, recommend using a level 3 or higher domain name. Example: mail.qcloud.com.</p>
     */
    public String getEmailIdentity() {
        return this.EmailIdentity;
    }

    /**
     * Set <p>For your sender domain name, recommend using a level 3 or higher domain name. Example: mail.qcloud.com.</p>
     * @param EmailIdentity <p>For your sender domain name, recommend using a level 3 or higher domain name. Example: mail.qcloud.com.</p>
     */
    public void setEmailIdentity(String EmailIdentity) {
        this.EmailIdentity = EmailIdentity;
    }

    /**
     * Get <p>Generated dkim key length. 0:1024, 1:2048</p> 
     * @return DKIMOption <p>Generated dkim key length. 0:1024, 1:2048</p>
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set <p>Generated dkim key length. 0:1024, 1:2048</p>
     * @param DKIMOption <p>Generated dkim key length. 0:1024, 1:2048</p>
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
    }

    /**
     * Get <p>tag</p> 
     * @return TagList <p>tag</p>
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>tag</p>
     * @param TagList <p>tag</p>
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    public CreateEmailIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmailIdentityRequest(CreateEmailIdentityRequest source) {
        if (source.EmailIdentity != null) {
            this.EmailIdentity = new String(source.EmailIdentity);
        }
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailIdentity", this.EmailIdentity);
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

