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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductConf extends AbstractModel{

    /**
    * Product type. Valid values: `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture), `10` (Redis 4.0 Hybrid Storage Edition (Tendis)).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Product name: Redis Master-Replica Edition, CKV Master-Replica Edition, CKV Cluster Edition, Redis Standalone Edition, Redis Cluster Edition, Tendis Hybrid Storage Edition
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
    */
    @SerializedName("Saleout")
    @Expose
    private Boolean Saleout;

    /**
    * Product engine: Tencent Cloud CKV or Redis community edition
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Compatible version: Redis 2.8, Redis 3.2, or Redis 4.0
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
    * Number of replicas
    */
    @SerializedName("ReplicaNum")
    @Expose
    private String [] ReplicaNum;

    /**
    * Number of shards
    */
    @SerializedName("ShardNum")
    @Expose
    private String [] ShardNum;

    /**
    * Supported billing method. 1: monthly subscription; 0: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Whether to support read-only replicas
    */
    @SerializedName("EnableRepicaReadOnly")
    @Expose
    private Boolean EnableRepicaReadOnly;

    /**
     * Get Product type. Valid values: `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture), `10` (Redis 4.0 Hybrid Storage Edition (Tendis)). 
     * @return Type Product type. Valid values: `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture), `10` (Redis 4.0 Hybrid Storage Edition (Tendis)).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Product type. Valid values: `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture), `10` (Redis 4.0 Hybrid Storage Edition (Tendis)).
     * @param Type Product type. Valid values: `2` (Redis 2.8 Memory Edition in standard architecture), `3` (CKV 3.2 Memory Edition in standard architecture), `4` (CKV 3.2 Memory Edition in cluster architecture), `5` (Redis 2.8 Memory Edition in standalone architecture), `6` (Redis 4.0 Memory Edition in standard architecture), `7` (Redis 4.0 Memory Edition in cluster architecture), `8` (Redis 5.0 Memory Edition in standard architecture), `9` (Redis 5.0 Memory Edition in cluster architecture), `10` (Redis 4.0 Hybrid Storage Edition (Tendis)).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Product name: Redis Master-Replica Edition, CKV Master-Replica Edition, CKV Cluster Edition, Redis Standalone Edition, Redis Cluster Edition, Tendis Hybrid Storage Edition 
     * @return TypeName Product name: Redis Master-Replica Edition, CKV Master-Replica Edition, CKV Cluster Edition, Redis Standalone Edition, Redis Cluster Edition, Tendis Hybrid Storage Edition
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Product name: Redis Master-Replica Edition, CKV Master-Replica Edition, CKV Cluster Edition, Redis Standalone Edition, Redis Cluster Edition, Tendis Hybrid Storage Edition
     * @param TypeName Product name: Redis Master-Replica Edition, CKV Master-Replica Edition, CKV Cluster Edition, Redis Standalone Edition, Redis Cluster Edition, Tendis Hybrid Storage Edition
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
     * @return Saleout Whether a product is sold out
     */
    public Boolean getSaleout() {
        return this.Saleout;
    }

    /**
     * Set Whether a product is sold out
     * @param Saleout Whether a product is sold out
     */
    public void setSaleout(Boolean Saleout) {
        this.Saleout = Saleout;
    }

    /**
     * Get Product engine: Tencent Cloud CKV or Redis community edition 
     * @return Engine Product engine: Tencent Cloud CKV or Redis community edition
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Product engine: Tencent Cloud CKV or Redis community edition
     * @param Engine Product engine: Tencent Cloud CKV or Redis community edition
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Compatible version: Redis 2.8, Redis 3.2, or Redis 4.0 
     * @return Version Compatible version: Redis 2.8, Redis 3.2, or Redis 4.0
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Compatible version: Redis 2.8, Redis 3.2, or Redis 4.0
     * @param Version Compatible version: Redis 2.8, Redis 3.2, or Redis 4.0
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
     * Get Number of replicas 
     * @return ReplicaNum Number of replicas
     */
    public String [] getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Number of replicas
     * @param ReplicaNum Number of replicas
     */
    public void setReplicaNum(String [] ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get Number of shards 
     * @return ShardNum Number of shards
     */
    public String [] getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Number of shards
     * @param ShardNum Number of shards
     */
    public void setShardNum(String [] ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get Supported billing method. 1: monthly subscription; 0: pay-as-you-go 
     * @return PayMode Supported billing method. 1: monthly subscription; 0: pay-as-you-go
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Supported billing method. 1: monthly subscription; 0: pay-as-you-go
     * @param PayMode Supported billing method. 1: monthly subscription; 0: pay-as-you-go
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether to support read-only replicas 
     * @return EnableRepicaReadOnly Whether to support read-only replicas
     */
    public Boolean getEnableRepicaReadOnly() {
        return this.EnableRepicaReadOnly;
    }

    /**
     * Set Whether to support read-only replicas
     * @param EnableRepicaReadOnly Whether to support read-only replicas
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

