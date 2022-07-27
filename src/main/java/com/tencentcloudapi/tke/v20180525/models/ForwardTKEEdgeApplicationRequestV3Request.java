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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardTKEEdgeApplicationRequestV3Request extends AbstractModel{

    /**
    * Access to request the cluster add-on
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Path to request the cluster add-on
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Data format allowed to receive the requested cluster add-on
    */
    @SerializedName("Accept")
    @Expose
    private String Accept;

    /**
    * Data format for requesting the cluster add-on
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * Data sent to request the cluster add-on
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * Cluster name (for example, `cls-1234abcd`)
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Whether to encode the request content
    */
    @SerializedName("EncodedBody")
    @Expose
    private String EncodedBody;

    /**
     * Get Access to request the cluster add-on 
     * @return Method Access to request the cluster add-on
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Access to request the cluster add-on
     * @param Method Access to request the cluster add-on
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Path to request the cluster add-on 
     * @return Path Path to request the cluster add-on
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path to request the cluster add-on
     * @param Path Path to request the cluster add-on
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Data format allowed to receive the requested cluster add-on 
     * @return Accept Data format allowed to receive the requested cluster add-on
     */
    public String getAccept() {
        return this.Accept;
    }

    /**
     * Set Data format allowed to receive the requested cluster add-on
     * @param Accept Data format allowed to receive the requested cluster add-on
     */
    public void setAccept(String Accept) {
        this.Accept = Accept;
    }

    /**
     * Get Data format for requesting the cluster add-on 
     * @return ContentType Data format for requesting the cluster add-on
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set Data format for requesting the cluster add-on
     * @param ContentType Data format for requesting the cluster add-on
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Data sent to request the cluster add-on 
     * @return RequestBody Data sent to request the cluster add-on
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set Data sent to request the cluster add-on
     * @param RequestBody Data sent to request the cluster add-on
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get Cluster name (for example, `cls-1234abcd`) 
     * @return ClusterName Cluster name (for example, `cls-1234abcd`)
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name (for example, `cls-1234abcd`)
     * @param ClusterName Cluster name (for example, `cls-1234abcd`)
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Whether to encode the request content 
     * @return EncodedBody Whether to encode the request content
     */
    public String getEncodedBody() {
        return this.EncodedBody;
    }

    /**
     * Set Whether to encode the request content
     * @param EncodedBody Whether to encode the request content
     */
    public void setEncodedBody(String EncodedBody) {
        this.EncodedBody = EncodedBody;
    }

    public ForwardTKEEdgeApplicationRequestV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardTKEEdgeApplicationRequestV3Request(ForwardTKEEdgeApplicationRequestV3Request source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Accept != null) {
            this.Accept = new String(source.Accept);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.EncodedBody != null) {
            this.EncodedBody = new String(source.EncodedBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Accept", this.Accept);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "EncodedBody", this.EncodedBody);

    }
}

