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
    * By default, prefetch for regions in the Chinese mainland is performed onto the intermediate nodes, while prefetch for regions outside the Chinese mainland is performed onto the edge nodes and the traffic generated will be billed.
If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node.
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * Whether to recursively resolve the M3U8 index file and prefetch the TS shards in it.
Notes:
1. This feature requires that the M3U8 index file can be directly requested and obtained.
2. In the M3U8 index file, currently only the TS shards at the first to the third level can be recursively resolved.
3. Prefetching the TS shards obtained through recursive resolution consumes the daily prefetch quota. If the usage exceeds the quota, the feature will be disabled and TS shards will not be prefetched.
    */
    @SerializedName("ParseM3U8")
    @Expose
    private Boolean ParseM3U8;

    /**
    * Specifies whether to disable Range GETs.
Notes:
This feature is in beta test.
    */
    @SerializedName("DisableRange")
    @Expose
    private Boolean DisableRange;

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
     * Get By default, prefetch for regions in the Chinese mainland is performed onto the intermediate nodes, while prefetch for regions outside the Chinese mainland is performed onto the edge nodes and the traffic generated will be billed.
If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node. 
     * @return Layer By default, prefetch for regions in the Chinese mainland is performed onto the intermediate nodes, while prefetch for regions outside the Chinese mainland is performed onto the edge nodes and the traffic generated will be billed.
If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node.
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set By default, prefetch for regions in the Chinese mainland is performed onto the intermediate nodes, while prefetch for regions outside the Chinese mainland is performed onto the edge nodes and the traffic generated will be billed.
If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node.
     * @param Layer By default, prefetch for regions in the Chinese mainland is performed onto the intermediate nodes, while prefetch for regions outside the Chinese mainland is performed onto the edge nodes and the traffic generated will be billed.
If this parameter is `middle` or left empty, prefetch will be performed onto the intermediate node.
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get Whether to recursively resolve the M3U8 index file and prefetch the TS shards in it.
Notes:
1. This feature requires that the M3U8 index file can be directly requested and obtained.
2. In the M3U8 index file, currently only the TS shards at the first to the third level can be recursively resolved.
3. Prefetching the TS shards obtained through recursive resolution consumes the daily prefetch quota. If the usage exceeds the quota, the feature will be disabled and TS shards will not be prefetched. 
     * @return ParseM3U8 Whether to recursively resolve the M3U8 index file and prefetch the TS shards in it.
Notes:
1. This feature requires that the M3U8 index file can be directly requested and obtained.
2. In the M3U8 index file, currently only the TS shards at the first to the third level can be recursively resolved.
3. Prefetching the TS shards obtained through recursive resolution consumes the daily prefetch quota. If the usage exceeds the quota, the feature will be disabled and TS shards will not be prefetched.
     */
    public Boolean getParseM3U8() {
        return this.ParseM3U8;
    }

    /**
     * Set Whether to recursively resolve the M3U8 index file and prefetch the TS shards in it.
Notes:
1. This feature requires that the M3U8 index file can be directly requested and obtained.
2. In the M3U8 index file, currently only the TS shards at the first to the third level can be recursively resolved.
3. Prefetching the TS shards obtained through recursive resolution consumes the daily prefetch quota. If the usage exceeds the quota, the feature will be disabled and TS shards will not be prefetched.
     * @param ParseM3U8 Whether to recursively resolve the M3U8 index file and prefetch the TS shards in it.
Notes:
1. This feature requires that the M3U8 index file can be directly requested and obtained.
2. In the M3U8 index file, currently only the TS shards at the first to the third level can be recursively resolved.
3. Prefetching the TS shards obtained through recursive resolution consumes the daily prefetch quota. If the usage exceeds the quota, the feature will be disabled and TS shards will not be prefetched.
     */
    public void setParseM3U8(Boolean ParseM3U8) {
        this.ParseM3U8 = ParseM3U8;
    }

    /**
     * Get Specifies whether to disable Range GETs.
Notes:
This feature is in beta test. 
     * @return DisableRange Specifies whether to disable Range GETs.
Notes:
This feature is in beta test.
     */
    public Boolean getDisableRange() {
        return this.DisableRange;
    }

    /**
     * Set Specifies whether to disable Range GETs.
Notes:
This feature is in beta test.
     * @param DisableRange Specifies whether to disable Range GETs.
Notes:
This feature is in beta test.
     */
    public void setDisableRange(Boolean DisableRange) {
        this.DisableRange = DisableRange;
    }

    public PushUrlsCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushUrlsCacheRequest(PushUrlsCacheRequest source) {
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.ParseM3U8 != null) {
            this.ParseM3U8 = new Boolean(source.ParseM3U8);
        }
        if (source.DisableRange != null) {
            this.DisableRange = new Boolean(source.DisableRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "ParseM3U8", this.ParseM3U8);
        this.setParamSimple(map, prefix + "DisableRange", this.DisableRange);

    }
}

