/**
 * Atlas REST API
 * Atlas exposes a variety of REST endpoints to work with types, entities, lineage and data discovery.
 *
 * OpenAPI spec version: 2.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class JsonAtlasGlossaryBaseObject (
  // 
  guid: Option[String] = None,
  // 
  classifications: Option[List[JsonAtlasClassification]] = None,
  // 
  longDescription: Option[String] = None,
  // 
  name: Option[String] = None,
  // 
  qualifiedName: Option[String] = None,
  // 
  shortDescription: Option[String] = None
)

