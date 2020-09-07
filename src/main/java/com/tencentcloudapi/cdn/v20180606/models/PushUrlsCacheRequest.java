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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushUrlsCacheRequest extends AbstractModel{

    /**
    * List of URLs. The protocol header such as "http://" or "https://" needs to be included.
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * Specifies the User-Agent header of an HTTP prefetch request when it is forwarded to the origin server
Default value: `TencentCdn`
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Destination region for the prefetch
`mainland`: prefetches resources to nodes within Mainland China
`overseas`: prefetches resources to nodes outside Mainland China
`global`: prefetches resources to global nodes
Default value: `mainland`. You can prefetch a URL to nodes in a region provided that CDN service has been enabled for the domain name in the URL in the region.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
     * Get List of URLs. The protocol header such as "http://" or "https://" needs to be included. 
     * @return Urls List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     * @param Urls List of URLs. The protocol header such as "http://" or "https://" needs to be included.
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get Specifies the User-Agent header of an HTTP prefetch request when it is forwarded to the origin server
Default value: `TencentCdn` 
     * @return UserAgent Specifies the User-Agent header of an HTTP prefetch request when it is forwarded to the origin server
Default value: `TencentCdn`
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set Specifies the User-Agent header of an HTTP prefetch request when it is forwarded to the origin server
Default value: `TencentCdn`
     * @param UserAgent Specifies the User-Agent header of an HTTP prefetch request when it is forwarded to the origin server
Default value: `TencentCdn`
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Destination region for the prefetch
`mainland`: prefetches resources to nodes within Mainland China
`overseas`: prefetches resources to nodes outside Mainland China
`global`: prefetches resources to global nodes
Default value: `mainland`. You can prefetch a URL to nodes in a region provided that CDN service has been enabled for the domain name in the URL in the region. 
     * @return Area Destination region for the prefetch
`mainland`: prefetches resources to nodes within Mainland China
`overseas`: prefetches resources to nodes outside Mainland China
`global`: prefetches resources to global nodes
Default value: `mainland`. You can prefetch a URL to nodes in a region provided that CDN service has been enabled for the domain name in the URL in the region.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Destination region for the prefetch
`mainland`: prefetches resources to nodes within Mainland China
`overseas`: prefetches resources to nodes outside Mainland China
`global`: prefetches resources to global nodes
Default value: `mainland`. You can prefetch a URL to nodes in a region provided that CDN service has been enabled for the domain name in the URL in the region.
     * @param Area Destination region for the prefetch
`mainland`: prefetches resources to nodes within Mainland China
`overseas`: prefetches resources to nodes outside Mainland China
`global`: prefetches resources to global nodes
Default value: `mainland`. You can prefetch a URL to nodes in a region provided that CDN service has been enabled for the domain name in the URL in the region.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node 
     * @return Layer If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node
     * @param Layer If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Layer", this.Layer);

    }
}

