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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SampleLog extends AbstractModel {

    /**
    * Millisecond timestamp.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Log attributes.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Attributes")
    @Expose
    private Attributes Attributes;

    /**
    * Request in har format in log.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get Millisecond timestamp.

Note: This field may return null, indicating that no valid value is found. 
     * @return Timestamp Millisecond timestamp.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Millisecond timestamp.

Note: This field may return null, indicating that no valid value is found.
     * @param Timestamp Millisecond timestamp.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log attributes.

Note: This field may return null, indicating that no valid value is found. 
     * @return Attributes Log attributes.

Note: This field may return null, indicating that no valid value is found.
     */
    public Attributes getAttributes() {
        return this.Attributes;
    }

    /**
     * Set Log attributes.

Note: This field may return null, indicating that no valid value is found.
     * @param Attributes Log attributes.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAttributes(Attributes Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get Request in har format in log.

Note: This field may return null, indicating that no valid value is found. 
     * @return Body Request in har format in log.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Request in har format in log.

Note: This field may return null, indicating that no valid value is found.
     * @param Body Request in har format in log.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public SampleLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SampleLog(SampleLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Attributes != null) {
            this.Attributes = new Attributes(source.Attributes);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

