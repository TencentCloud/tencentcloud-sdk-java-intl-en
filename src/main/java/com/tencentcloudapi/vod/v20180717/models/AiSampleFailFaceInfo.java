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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSampleFailFaceInfo extends AbstractModel {

    /**
    * Incorrect image subscript in the input parameter FaceContents, starting from 0.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Error code. Value:
<li>0: success;</li>
<li>Other: Failed.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error description.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Incorrect image subscript in the input parameter FaceContents, starting from 0. 
     * @return Index Incorrect image subscript in the input parameter FaceContents, starting from 0.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Incorrect image subscript in the input parameter FaceContents, starting from 0.
     * @param Index Incorrect image subscript in the input parameter FaceContents, starting from 0.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Error code. Value:
<li>0: success;</li>
<li>Other: Failed.</li> 
     * @return ErrCode Error code. Value:
<li>0: success;</li>
<li>Other: Failed.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. Value:
<li>0: success;</li>
<li>Other: Failed.</li>
     * @param ErrCode Error code. Value:
<li>0: success;</li>
<li>Other: Failed.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error description. 
     * @return Message Error description.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error description.
     * @param Message Error description.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public AiSampleFailFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSampleFailFaceInfo(AiSampleFailFaceInfo source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

