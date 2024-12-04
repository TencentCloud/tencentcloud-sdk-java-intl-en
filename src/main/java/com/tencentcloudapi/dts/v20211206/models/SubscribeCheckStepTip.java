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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeCheckStepTip extends AbstractModel {

    /**
    * Error or warning detailsNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Help documentation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get Error or warning detailsNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Error or warning detailsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error or warning detailsNote: This field may return null, indicating that no valid values can be obtained.
     * @param Message Error or warning detailsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Help documentation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HelpDoc Help documentation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set Help documentation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HelpDoc Help documentation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    public SubscribeCheckStepTip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeCheckStepTip(SubscribeCheckStepTip source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String(source.HelpDoc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

