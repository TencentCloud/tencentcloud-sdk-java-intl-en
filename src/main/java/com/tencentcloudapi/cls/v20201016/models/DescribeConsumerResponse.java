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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerResponse extends AbstractModel {

    /**
    * Whether the shipping task is effective
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * Whether log metadata is shipped
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * Metadata shipped if `NeedContent` is `true`
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * CKafka information
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * Compression mode. Valid values: `0` (no compression), `2` (snappy), `3` (LZ4).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the shipping task is effective 
     * @return Effective Whether the shipping task is effective
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set Whether the shipping task is effective
     * @param Effective Whether the shipping task is effective
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get Whether log metadata is shipped 
     * @return NeedContent Whether log metadata is shipped
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set Whether log metadata is shipped
     * @param NeedContent Whether log metadata is shipped
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get Metadata shipped if `NeedContent` is `true`
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Content Metadata shipped if `NeedContent` is `true`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set Metadata shipped if `NeedContent` is `true`
Note: This field may return `null`, indicating that no valid value was found.
     * @param Content Metadata shipped if `NeedContent` is `true`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get CKafka information 
     * @return Ckafka CKafka information
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set CKafka information
     * @param Ckafka CKafka information
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Compression mode. Valid values: `0` (no compression), `2` (snappy), `3` (LZ4).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compression Compression mode. Valid values: `0` (no compression), `2` (snappy), `3` (LZ4).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set Compression mode. Valid values: `0` (no compression), `2` (snappy), `3` (LZ4).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compression Compression mode. Valid values: `0` (no compression), `2` (snappy), `3` (LZ4).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConsumerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerResponse(DescribeConsumerResponse source) {
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

