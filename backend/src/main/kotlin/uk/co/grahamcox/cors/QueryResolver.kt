package uk.co.grahamcox.cors

import com.coxautodev.graphql.tools.GraphQLQueryResolver

/**
 * Resolver for the root query
 */
class QueryResolver : GraphQLQueryResolver {
    /** The API version */
    val version = "1.0.0"
}
