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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductConf extends AbstractModel {

    /**
    * Product type
- `2`: Redis 2.8 Memory Edition (Standard Architecture).
- `3`: CKV 3.2 Memory Edition (Standard Architecture).
- `4`: CKV 3.2 Memory Edition (Cluster Architecture).
- `5`: Redis 2.8 Memory Edition (Standalone).
- `6`: Redis 4.0 Memory Edition (Standard Architecture).
- `7`: Redis 4.0 Memory Edition (Cluster Architecture).
- `8`: Redis 5.0 Memory Edition (Standard Architecture).
- `9`: Redis 5.0 Memory Edition (Cluster Architecture).
- `15`: Redis 6.2 Memory Edition (Standard Architecture).
- `16`: Redis 6.2 Memory Edition (Cluster Architecture).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Product names, including Redis Master-Replica Edition, Redis Standalone Edition, Redis 4.0 Cluster Edition, CKV Master-Replica Edition, and CKV Standalone Edition.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Minimum purchasable quantity
    */
    @SerializedName("MinBuyNum")
    @Expose
    private Long MinBuyNum;

    /**
    * Maximum purchasable quantity
    */
    @SerializedName("MaxBuyNum")
    @Expose
    private Long MaxBuyNum;

    /**
    * Whether a product is sold out
- `true`: Sold out.
- `false`: Not sold out.
    */
    @SerializedName("Saleout")
    @Expose
    private Boolean Saleout;

    /**
    * Product engines, including Tencent Cloud CKV and Redis Community Edition.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Compatible versions, including Redis 2.8, 3.2, 4.0, 5.0, and 6.2.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Total capacity in GB
    */
    @SerializedName("TotalSize")
    @Expose
    private String [] TotalSize;

    /**
    * Shard size in GB
    */
    @SerializedName("ShardSize")
    @Expose
    private String [] ShardSize;

    /**
    * Quantity of replicas
    */
    @SerializedName("ReplicaNum")
    @Expose
    private String [] ReplicaNum;

    /**
    * Quantity of shards
    */
    @SerializedName("ShardNum")
    @Expose
    private String [] ShardNum;

    /**
    * Supported billing modes
- `1`: Monthly subscription.
- `0`: Pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Whether to support read-only replicas
- `true`: Supported.
-`false`: Not supported.
    */
    @SerializedName("EnableRepicaReadOnly")
    @Expose
    private Boolean EnableRepicaReadOnly;

    /**
     * Get Product type
- `2`: Redis 2.8 Memory Edition (Standard Architecture).
- `3`: CKV 3.2 Memory Edition (Standard Architecture).
- `4`: CKV 3.2 Memory Edition (Cluster Architecture).
- `5`: Redis 2.8 Memory Edition (Standalone).
- `6`: Redis 4.0 Memory Edition (Standard Architecture).
- `7`: Redis 4.0 Memory Edition (Cluster Architecture).
- `8`: Redis 5.0 Memory Edition (Standard Architecture).
- `9`: Redis 5.0 Memory Edition (Cluster Architecture).
- `15`: Redis 6.2 Memory Edition (Standard Architecture).
- `16`: Redis 6.2 Memory Edition (Cluster Architecture). 
     * @return Type Product type
- `2`: Redis 2.8 Memory Edition (Standard Architecture).
- `3`: CKV 3.2 Memory Edition (Standard Architecture).
- `4`: CKV 3.2 Memory Edition (Cluster Architecture).
- `5`: Redis 2.8 Memory Edition (Standalone).
- `6`: Redis 4.0 Memory Edition (Standard Architecture).
- `7`: Redis 4.0 Memory Edition (Cluster Architecture).
- `8`: Redis 5.0 Memory Edition (Standard Architecture).
- `9`: Redis 5.0 Memory Edition (Cluster Architecture).
- `15`: Redis 6.2 Memory Edition (Standard Architecture).
- `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Product type
- `2`: Redis 2.8 Memory Edition (Standard Architecture).
- `3`: CKV 3.2 Memory Edition (Standard Architecture).
- `4`: CKV 3.2 Memory Edition (Cluster Architecture).
- `5`: Redis 2.8 Memory Edition (Standalone).
- `6`: Redis 4.0 Memory Edition (Standard Architecture).
- `7`: Redis 4.0 Memory Edition (Cluster Architecture).
- `8`: Redis 5.0 Memory Edition (Standard Architecture).
- `9`: Redis 5.0 Memory Edition (Cluster Architecture).
- `15`: Redis 6.2 Memory Edition (Standard Architecture).
- `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     * @param Type Product type
- `2`: Redis 2.8 Memory Edition (Standard Architecture).
- `3`: CKV 3.2 Memory Edition (Standard Architecture).
- `4`: CKV 3.2 Memory Edition (Cluster Architecture).
- `5`: Redis 2.8 Memory Edition (Standalone).
- `6`: Redis 4.0 Memory Edition (Standard Architecture).
- `7`: Redis 4.0 Memory Edition (Cluster Architecture).
- `8`: Redis 5.0 Memory Edition (Standard Architecture).
- `9`: Redis 5.0 Memory Edition (Cluster Architecture).
- `15`: Redis 6.2 Memory Edition (Standard Architecture).
- `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Product names, including Redis Master-Replica Edition, Redis Standalone Edition, Redis 4.0 Cluster Edition, CKV Master-Replica Edition, and CKV Standalone Edition. 
     * @return TypeName Product names, including Redis Master-Replica Edition, Redis Standalone Edition, Redis 4.0 Cluster Edition, CKV Master-Replica Edition, and CKV Standalone Edition.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Product names, including Redis Master-Replica Edition, Redis Standalone Edition, Redis 4.0 Cluster Edition, CKV Master-Replica Edition, and CKV Standalone Edition.
     * @param TypeName Product names, including Redis Master-Replica Edition, Redis Standalone Edition, Redis 4.0 Cluster Edition, CKV Master-Replica Edition, and CKV Standalone Edition.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Minimum purchasable quantity 
     * @return MinBuyNum Minimum purchasable quantity
     */
    public Long getMinBuyNum() {
        return this.MinBuyNum;
    }

    /**
     * Set Minimum purchasable quantity
     * @param MinBuyNum Minimum purchasable quantity
     */
    public void setMinBuyNum(Long MinBuyNum) {
        this.MinBuyNum = MinBuyNum;
    }

    /**
     * Get Maximum purchasable quantity 
     * @return MaxBuyNum Maximum purchasable quantity
     */
    public Long getMaxBuyNum() {
        return this.MaxBuyNum;
    }

    /**
     * Set Maximum purchasable quantity
     * @param MaxBuyNum Maximum purchasable quantity
     */
    public void setMaxBuyNum(Long MaxBuyNum) {
        this.MaxBuyNum = MaxBuyNum;
    }

    /**
     * Get Whether a product is sold out
- `true`: Sold out.
- `false`: Not sold out. 
     * @return Saleout Whether a product is sold out
- `true`: Sold out.
- `false`: Not sold out.
     */
    public Boolean getSaleout() {
        return this.Saleout;
    }

    /**
     * Set Whether a product is sold out
- `true`: Sold out.
- `false`: Not sold out.
     * @param Saleout Whether a product is sold out
- `true`: Sold out.
- `false`: Not sold out.
     */
    public void setSaleout(Boolean Saleout) {
        this.Saleout = Saleout;
    }

    /**
     * Get Product engines, including Tencent Cloud CKV and Redis Community Edition. 
     * @return Engine Product engines, including Tencent Cloud CKV and Redis Community Edition.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Product engines, including Tencent Cloud CKV and Redis Community Edition.
     * @param Engine Product engines, including Tencent Cloud CKV and Redis Community Edition.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Compatible versions, including Redis 2.8, 3.2, 4.0, 5.0, and 6.2. 
     * @return Version Compatible versions, including Redis 2.8, 3.2, 4.0, 5.0, and 6.2.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Compatible versions, including Redis 2.8, 3.2, 4.0, 5.0, and 6.2.
     * @param Version Compatible versions, including Redis 2.8, 3.2, 4.0, 5.0, and 6.2.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Total capacity in GB 
     * @return TotalSize Total capacity in GB
     */
    public String [] getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total capacity in GB
     * @param TotalSize Total capacity in GB
     */
    public void setTotalSize(String [] TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get Shard size in GB 
     * @return ShardSize Shard size in GB
     */
    public String [] getShardSize() {
        return this.ShardSize;
    }

    /**
     * Set Shard size in GB
     * @param ShardSize Shard size in GB
     */
    public void setShardSize(String [] ShardSize) {
        this.ShardSize = ShardSize;
    }

    /**
     * Get Quantity of replicas 
     * @return ReplicaNum Quantity of replicas
     */
    public String [] getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Quantity of replicas
     * @param ReplicaNum Quantity of replicas
     */
    public void setReplicaNum(String [] ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get Quantity of shards 
     * @return ShardNum Quantity of shards
     */
    public String [] getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Quantity of shards
     * @param ShardNum Quantity of shards
     */
    public void setShardNum(String [] ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get Supported billing modes
- `1`: Monthly subscription.
- `0`: Pay-as-you-go. 
     * @return PayMode Supported billing modes
- `1`: Monthly subscription.
- `0`: Pay-as-you-go.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Supported billing modes
- `1`: Monthly subscription.
- `0`: Pay-as-you-go.
     * @param PayMode Supported billing modes
- `1`: Monthly subscription.
- `0`: Pay-as-you-go.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether to support read-only replicas
- `true`: Supported.
-`false`: Not supported. 
     * @return EnableRepicaReadOnly Whether to support read-only replicas
- `true`: Supported.
-`false`: Not supported.
     */
    public Boolean getEnableRepicaReadOnly() {
        return this.EnableRepicaReadOnly;
    }

    /**
     * Set Whether to support read-only replicas
- `true`: Supported.
-`false`: Not supported.
     * @param EnableRepicaReadOnly Whether to support read-only replicas
- `true`: Supported.
-`false`: Not supported.
     */
    public void setEnableRepicaReadOnly(Boolean EnableRepicaReadOnly) {
        this.EnableRepicaReadOnly = EnableRepicaReadOnly;
    }

    public ProductConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductConf(ProductConf source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.MinBuyNum != null) {
            this.MinBuyNum = new Long(source.MinBuyNum);
        }
        if (source.MaxBuyNum != null) {
            this.MaxBuyNum = new Long(source.MaxBuyNum);
        }
        if (source.Saleout != null) {
            this.Saleout = new Boolean(source.Saleout);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new String[source.TotalSize.length];
            for (int i = 0; i < source.TotalSize.length; i++) {
                this.TotalSize[i] = new String(source.TotalSize[i]);
            }
        }
        if (source.ShardSize != null) {
            this.ShardSize = new String[source.ShardSize.length];
            for (int i = 0; i < source.ShardSize.length; i++) {
                this.ShardSize[i] = new String(source.ShardSize[i]);
            }
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new String[source.ReplicaNum.length];
            for (int i = 0; i < source.ReplicaNum.length; i++) {
                this.ReplicaNum[i] = new String(source.ReplicaNum[i]);
            }
        }
        if (source.ShardNum != null) {
            this.ShardNum = new String[source.ShardNum.length];
            for (int i = 0; i < source.ShardNum.length; i++) {
                this.ShardNum[i] = new String(source.ShardNum[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.EnableRepicaReadOnly != null) {
            this.EnableRepicaReadOnly = new Boolean(source.EnableRepicaReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "MinBuyNum", this.MinBuyNum);
        this.setParamSimple(map, prefix + "MaxBuyNum", this.MaxBuyNum);
        this.setParamSimple(map, prefix + "Saleout", this.Saleout);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "TotalSize.", this.TotalSize);
        this.setParamArraySimple(map, prefix + "ShardSize.", this.ShardSize);
        this.setParamArraySimple(map, prefix + "ReplicaNum.", this.ReplicaNum);
        this.setParamArraySimple(map, prefix + "ShardNum.", this.ShardNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "EnableRepicaReadOnly", this.EnableRepicaReadOnly);

    }
}

